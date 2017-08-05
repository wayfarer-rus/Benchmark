package com.difference.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by aleksandrprendota on 05.08.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CookieServiceTest {

    @Autowired
    private CookieService cookieService;

    @Test
    public void testCookieJavaService(){
        Assert.assertTrue(cookieService.getAllCookie().size() > 0);
    }
}