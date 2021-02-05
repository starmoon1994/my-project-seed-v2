package com.company.project.batch;

import com.company.project.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class P1000UserItemProcessor implements ItemProcessor<User, User> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public User process(final User item) throws Exception {

        logger.info("UserItemProcessor coming userinfo:id={} ,Username={} ", item.getId(), item.getUsername());


//        logger.info("UserItemProcessor end  userinfo:id={} ,Username={} ", item.getId(), item.getUsername());
        return item;
    }

}