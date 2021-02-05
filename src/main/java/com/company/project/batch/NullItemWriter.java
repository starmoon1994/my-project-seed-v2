package com.company.project.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class  NullItemWriter<T> implements ItemWriter<T> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void write(List<? extends T> items) throws Exception {
        logger.info("NullItemWriter do nothing");
    }
}
