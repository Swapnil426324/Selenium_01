package com.jbk.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.constant.Locators;
import com.jbk.constant.WaitUtils;

public class WaitDemo {

    WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();	
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	//implicit wait
	@Test
	public void implicitWait() {
		driver.findElement(By.id("btn1")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("txt1"));
		ele.sendKeys("welcome1");
		Assert.assertTrue(ele.isDisplayed());
	 }
	
	//explicit wait
	@Test
	public void explicitWait() {
		driver.findElement(By.id("btn1")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		ele.sendKeys("welcome2");
		Assert.assertTrue(ele.isDisplayed());
		
	 }
	
	@Test
	public void utilityWaitMethod() {
		driver.findElement(By.id("btn1")).click();
		WebElement ele = WaitUtils.expectedWait(driver, Locators.BY_ID);
		ele.sendKeys("welcome3");
		Assert.assertTrue(ele.isDisplayed());
		
	 }
}
