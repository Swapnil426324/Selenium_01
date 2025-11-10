package com.jbk.wait2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class TestEx {
	
	WebDriver driver;

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
