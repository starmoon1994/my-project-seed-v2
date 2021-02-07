package com.conpany.project;

import com.alibaba.fastjson.JSONObject;
import com.company.project.mapper.TAccountMapper;
import com.company.project.model.TAccount;
import com.company.project.model.TAccountExample;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class AccountTest extends BaseTester {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private TAccountMapper tAccountMapper;

    @Test
    public void test1() {
        System.out.println("hello");


        List<TAccount> tAccountList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            TAccount tAccount = new TAccount();
            tAccount.setGlobalId("G" + i);
            tAccount.setTotalAmt(new BigDecimal(new Random().nextInt(1000)));
            tAccount.setFrozenAmt(new BigDecimal(new Random().nextInt(1000)));
            tAccount.setHotAccount((byte) 0);
            tAccount.setCrDatetime(new Date());
            tAccount.setLmDatetime(new Date());
            tAccount.setVersion(0);
            tAccountList.add(tAccount);
            tAccountMapper.insertSelective(tAccount);


            TAccountExample tAccountExample = new TAccountExample();
            TAccountExample.Criteria criteria = tAccountExample.createCriteria();
            criteria.andGlobalIdEqualTo("G" + i);

            List<TAccount> tAccountsInDB = tAccountMapper.selectByExample(tAccountExample);
            logger.info("tAccountsInDB={}", JSONObject.toJSONString(tAccountsInDB));
        }



        // https://blog.csdn.net/supzhili/article/details/102650573
//        tAccountMapper.in(tAccountList);
    }
}
