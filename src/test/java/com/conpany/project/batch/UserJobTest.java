package com.conpany.project.batch;

import com.company.project.Application;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.StepScopeTestExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.sql.DataSource;


@SpringBootTest(classes = Application.class)
//@SpringBatchTest
//@RunWith(SpringRunner.class) // junit5 用法不同
@ContextConfiguration(locations = {"classpath:spring-bean-test.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        StepScopeTestExecutionListener.class})
public class UserJobTest {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private DataSource dataSource;

    @Autowired
    @Qualifier("demoUserJobTestUtils")
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test  // org.junit.jupiter.api.Test;
    public void testUserJob() throws Exception {

        System.out.println("Starting");

        JobExecution jobExecution = jobLauncherTestUtils.launchJob(new JobParametersBuilder().addLong("currentTimeMillis", System.currentTimeMillis()).toJobParameters());
        Assert.assertEquals("COMPLETED", jobExecution.getExitStatus().getExitCode());


        System.out.println("end ...");
    }

//    @Test
//    public void testOtherProperties() throws Exception {
//
////        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");/*
//
//        JdbcCursorItemReader<User> reader = new JdbcCursorItemReaderBuilder<User>()
//                .dataSource(this.dataSource)
//                .name("userReader")
//                .sql("SELECT * FROM USER ORDER BY FIRST")
//                .fetchSize(1)
//                .queryTimeout(2)
//                .ignoreWarnings(true)
//                .driverSupportsAbsolute(true)
//                .useSharedExtendedConnection(true)
//                .connectionAutoCommit(true)
//                .beanRowMapper(User.class)
//                .build();
//
//        assertEquals(1, ReflectionTestUtils.getField(reader, "fetchSize"));
//        assertEquals(2, ReflectionTestUtils.getField(reader, "queryTimeout"));
//        assertTrue((boolean) ReflectionTestUtils.getField(reader, "ignoreWarnings"));
//        assertTrue((boolean) ReflectionTestUtils.getField(reader, "driverSupportsAbsolute"));
//        assertTrue((boolean) ReflectionTestUtils.getField(reader, "connectionAutoCommit"));
//
//    }


}
