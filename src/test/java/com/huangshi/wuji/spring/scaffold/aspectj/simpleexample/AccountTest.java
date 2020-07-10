package com.huangshi.wuji.spring.scaffold.aspectj.simpleexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    private Account account;

    @Before
    public void before() {
        account = new Account();
    }

    @Test
    public void given20AndMin10_whenWithdraw5_thenSuccess() {
        Assert.assertTrue(account.withdraw(5));
    }

    @Test
    public void given20AndMin10_whenWithdraw100_thenFail() {
        Assert.assertFalse(account.withdraw(100));
    }
}
