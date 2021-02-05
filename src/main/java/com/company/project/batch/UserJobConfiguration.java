package com.company.project.batch;

import com.company.project.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.ExtendedConnectionDataSourceProxy;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.batch.item.database.builder.JdbcPagingItemReaderBuilder;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


// 1读取DB  2产生文件  3读取流水文件  4 逐笔操作金额
@Configuration
public class UserJobConfiguration {


    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;


    @Bean("demoUserJob")
    public Job demoUserJob(JobCompletionNotificationListener listener,
                           @Qualifier("S1000-ReadUser-Step") Step step1000,
                           @Qualifier("S2000-ReadUser-Step") Step step2000
    ) {
        return jobBuilderFactory.get("demoUserJob")
//                .listener()
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .start(step1000)
                .next(step2000)
                .build();
    }


    @Bean("R1000UserItemReader")
    public JdbcCursorItemReader<User> R1000UserItemReader(DataSource dataSource) {

        // 此处有坑，用连接池，必须要要再包装一层  org.springframework.batch.item.database.AbstractCursorItemReader.initializeConnection
        ExtendedConnectionDataSourceProxy extendedConnectionDataSourceProxy = new ExtendedConnectionDataSourceProxy(dataSource);

        // JdbcCursorItemReader  JDBC游标Reader 无事务要求，READ_ONLY，可设置每次查询的获取数量
        // 按游标，逐批read数据
        return new JdbcCursorItemReaderBuilder<User>()
                .dataSource(extendedConnectionDataSourceProxy)
                .name("R1000UserItemReader")
                .sql("SELECT * FROM USER")
                .fetchSize(3)
                .queryTimeout(20)
                .ignoreWarnings(true)
                .driverSupportsAbsolute(true)
                .useSharedExtendedConnection(true)
                .connectionAutoCommit(true)
                .beanRowMapper(User.class)
                .build();
    }

    @Bean("P1000UserItemProcessor")
    public P1000UserItemProcessor P1000UserItemProcessor() {
        return new P1000UserItemProcessor();
    }


    @Bean("W1000UserItemProcessor")
    public NullItemWriter<User> W1000UserItemProcessor(DataSource dataSource) {
        return new NullItemWriter<User>();
    }

    @Bean("W2000UserItemProcessor")
    public NullItemWriter<User> W2000UserItemProcessor(DataSource dataSource) {
        return new NullItemWriter<User>();
    }

    @Bean("S1000-ReadUser-Step")
    public Step step1(ItemReader<User> R1000UserItemReader, ItemProcessor<User, User> P1000UserItemProcessor, ItemWriter<User> W1000UserItemProcessor) {
        return stepBuilderFactory.get("UserStep1000")
                .<User, User>chunk(10)
                .reader(R1000UserItemReader)
                .processor(P1000UserItemProcessor)
                .writer(W1000UserItemProcessor)
                .build();
    }


    @Bean("S2000-ReadUser-Step")
    public Step step2(ItemReader<User> R2000UserPagingItemReader, ItemProcessor<User, User> P2000UserItemProcessor, ItemWriter<User> W2000UserItemProcessor) {
        return stepBuilderFactory.get("UserStep2000")
                .<User, User>chunk(10)
                .reader(R2000UserPagingItemReader)
                .processor(P2000UserItemProcessor)
                .writer(W2000UserItemProcessor)
                .build();
    }


    @Bean("R2000UserPagingItemReader")
    public JdbcPagingItemReader<User> R2000UserItemReader(DataSource dataSource) {

        // 此处有坑，用连接池，必须要要再包装一层  org.springframework.batch.item.database.AbstractCursorItemReader.initializeConnection
        ExtendedConnectionDataSourceProxy extendedConnectionDataSourceProxy = new ExtendedConnectionDataSourceProxy(dataSource);

        Map<String, Order> sortKeys = new HashMap<>(1);
        sortKeys.put("ID", Order.DESCENDING);

        return new JdbcPagingItemReaderBuilder<User>()
                .name("R2000UserPagingItemReader")
                .currentItemCount(1)
                .dataSource(extendedConnectionDataSourceProxy)
//                .maxItemCount(2)
                .selectClause("SELECT * ")
                .fromClause("USER")
                .sortKeys(sortKeys)
                .beanRowMapper(User.class)
                .build();
    }


    @Bean("P2000UserItemProcessor")
    public FunctionItemProcessor<User, User> P2000UserItemProcessor() {
        return new FunctionItemProcessor<>(new Function<User, User>() {

            private final Logger logger = LoggerFactory.getLogger(this.getClass());

            @Override
            public User apply(User item) {

                logger.info("P2000UserItemProcessor coming userinfo:id={} ,Username={} ", item.getId(), item.getUsername());
//                logger.info("P2000UserItemProcessor ending userinfo:id={} ,Username={} ", item.getId(), item.getUsername());
                return null;
            }
        });
    }


}
