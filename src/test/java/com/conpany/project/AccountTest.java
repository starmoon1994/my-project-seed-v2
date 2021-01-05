package com.conpany.project;

import com.company.project.model.TAccount;
import com.company.project.service.impl.TAccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class AccountTest extends BaseTester {

    @Autowired
    private TAccountServiceImpl tAccountService;

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
        }


        tAccountService.save(tAccountList);
    }
}
