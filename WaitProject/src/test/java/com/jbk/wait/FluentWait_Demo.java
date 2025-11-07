package com.jbk.wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FluentWait_Demo {

	@Test
	public void test01() {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Max wait time - > total timeout
                .pollingEvery(Duration.ofSeconds(5))  // Polling frequency -> check every 2 second
                .ignoring(NoSuchElementException.class);  // Ignore if element not found

		boolean b1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1"))).isDisplayed();
		Assert.assertTrue(b1);
	 }
}
