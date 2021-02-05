package com.company.project.batch;

import com.company.project.model.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class R2000UserReader implements ItemReader<List<User>> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<User> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        logger.info("start ...");

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            User user = new User();
            user.setId(1000 + i);
            user.setUsername(RandomStringUtils.random(6));
            user.setPassword("");
            user.setNick_name("");
            user.setSex(0);
            user.setRegister_date(new Date());

            users.add(user);

        }

        logger.info("end ...");

        return users;
    }
}
