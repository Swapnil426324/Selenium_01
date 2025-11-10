package com.jbk.wait2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestEx {
	
	WebDriver driver = null;
	
    // implicit wait utility method
	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// explicit wait utility method
	public WebElement setExplicitWait(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		return element;
	}
	
   public void conflict() {
	  System.out.println("local system changes"); 
   }
   
	public void m1(){
		
	}

}
