package com.difference;

import com.difference.service.ChocolateServiceTest;
import com.difference.service.CookieServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		CookieServiceTest.class,
		ChocolateServiceTest.class
})
public class DemoApplicationTests {

}
