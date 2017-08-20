package com.difference;

import com.difference.java.service.ChocolateServiceTest;
import com.difference.java.service.CookieServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		CookieServiceTest.class,
		ChocolateServiceTest.class
})
public class KotlinTestApplicationTests {

}
