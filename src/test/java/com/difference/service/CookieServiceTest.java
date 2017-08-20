package com.difference.service;

import com.difference.model.Cookie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandrprendota on 05.08.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CookieServiceTest {

    @Autowired
    private CookieService cookieService;

    @Test
    public void testCookieJavaService() throws IOException, InterruptedException {
        System.out.println("Test started. Press enter:");
        Thread.sleep(10000);
        System.out.println("Wait while calculating results.");
        List<Cookie> cookies = new ArrayList<>();
        long before = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            cookies = cookieService.getAllCookie();
        }
        long after = System.nanoTime();
        System.out.println("Метод Java работал: " + (after - before));
        System.out.println(cookies);

        /*
        t = ns.

        cold:
        469492112
        525681518
        336624335
        407565190
        880662212

        hot:
        47147145769
        45662786451
        60554124036
        56237227453
        60357532444

        hot and sout:
        46537489878
        50154950457
        48055425163
        49296392084
        50949810447
        44285138706
        48185440217
         */
    }

}