package com.jbk.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	@Test
	public void loginTest() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
	    //driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String actUrl = driver.getCurrentUrl();
	    String excUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    Assert.assertEquals(actUrl, excUrl);
		
	}
	
		
}
