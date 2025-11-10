package com.jbk.wait2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class TestEx {
	
	WebDriver driver;
    // implicit wait utility method
	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
