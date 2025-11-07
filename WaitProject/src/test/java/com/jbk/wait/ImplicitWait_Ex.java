package com.jbk.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitWait_Ex {

	@Test
	public void test01() {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele1 = driver.findElement(By.id("txt1"));
		ele1.sendKeys("welcome1");
		
		driver.findElement(By.id("btn2")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele2 = driver.findElement(By.id("txt2"));
		ele2.sendKeys("welcome2");
		
		driver.findElement(By.xpath("//*[@id=\"yt-subscribe\"]/span/button/span/span[1]")).click();
		Assert.assertEquals(ele1.isDisplayed(), ele2.isDisplayed());
	 }
}
