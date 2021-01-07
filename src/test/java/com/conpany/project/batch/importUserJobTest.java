package com.conpany.project.batch;

import com.company.project.Application;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.StepScopeTestExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@SpringBootTest(classes = Application.class)
//@SpringBatchTest
//@RunWith(SpringRunner.class) // junit5 用法不同
@ContextConfiguration(locations = {"classpath:spring-bean-test.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        StepScopeTestExecutionListener.class})
public class importUserJobTest {
    @Autowired
    @Qualifier("importUserJobLauncherTestUtils2")
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testJob() throws Exception {


        JobExecution jobExecution = jobLauncherTestUtils.launchJob();
        Assert.assertEquals("COMPLETED", jobExecution.getExitStatus().getExitCode());


//        JobExecution jobExecution = jobLauncherTestUtils.launchStep("loadFileStep");
    }

    @Test
    public void testStep() throws Exception {
        JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");
        Assert.assertEquals("COMPLETED", jobExecution.getExitStatus().getExitCode());
    }


}
