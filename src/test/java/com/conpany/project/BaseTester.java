package com.conpany.project;


import com.company.project.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * 单元测试继承该类即可
 */
@SpringBootTest(classes = Application.class)
@Transactional
@Rollback(value = false)
public abstract class BaseTester {


}



