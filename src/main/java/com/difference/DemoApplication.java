package com.difference;

import com.difference.model.Chocolate;
import com.difference.model.Cookie;
import com.difference.service.ChocolateService;
import com.difference.service.CookieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private  CookieService cookieService;

	@Autowired
	private  ChocolateService chocolateService;

	public static void main(String[] args) throws Exception{
		SpringApplication.run(DemoApplication.class, args);
	}

	private void testKotlin() throws InterruptedException {
		System.out.println("Test Kotlin started");
		Thread.sleep(1000);
		System.out.println("Wait while calculating results.");

		List<Chocolate> chocolates = new ArrayList<>();
		long before = System.nanoTime();
		for (int i = 0; i < 10000; i++){
			chocolates = chocolateService.getAllChocolate();
		}
		long after = System.nanoTime();
		System.out.println("Метод Kotlin работал: " + (after - before));
		System.out.println(chocolates);
	}

	private void testJava() throws InterruptedException {
		System.out.println("Test Java started");
		Thread.sleep(1000);
		System.out.println("Wait while calculating results.");
		List<Cookie> cookies = new ArrayList<>();
		long before = System.nanoTime();
		for (int i = 0; i < 10000; i++){
			cookies = cookieService.getAllCookie();
		}
		long after = System.nanoTime();
		System.out.println("Метод Java работал: " + (after - before));
		System.out.println(cookies);
	}

	@Bean
	public String testBench() throws InterruptedException {
		testKotlin();
		testJava();
		return "hey!";
	}
}
