package com.difference;

import com.difference.java.model.Cookie;
import com.difference.java.service.CookieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JavaTestApplication {

	@Autowired
	private  CookieService cookieService;

	public static void main(String[] args) throws Exception{
		SpringApplication.run(JavaTestApplication.class, args);
	}

	private long testJava() throws InterruptedException {
		System.out.println("Test Java started");
		Thread.sleep(1000);
		System.out.println("Wait while calculating results.");

		long before = System.nanoTime();
        List<Cookie> cookies = load();
		long after = System.nanoTime();

		System.out.println(cookies);
		return (after - before);
	}

    private List<Cookie> load() {
        List<Cookie> cookies = new ArrayList<>();
        for (int i = 0; i < 10000; i++){
            cookies = cookieService.getAllCookie();
        }
        return cookies;
    }

    @Bean
	public String testBench() throws InterruptedException {
        System.out.println("Warming up JVM...");
        load();
        System.out.println("JVM should be warmed up! Run performance test...");
        long nanos = testJava();
        // transform nanos to human-friendly time
        Duration duration = Duration.ofNanos(nanos);
        System.out.println("Java finished collecting data in: " + duration);
        return "done!";
	}
}
