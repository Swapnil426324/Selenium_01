package com.jbk.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait_Ex {
	@Test
	public void test01() {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn2")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2"))).sendKeys("welcome");
		
	 }
	
	@Test
	public void implicitWait() {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		driver.findElement(By.id("name")).sendKeys("swapnil");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit-btn"))).click();
		//driver.findElement(By.id("submit-btn")).click();
		
		
	 }
}
