package com.jbk.wait2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	
	@Test
	public void openBrowser() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobile");	
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-price']"));

		for(WebElement element : list) {
			String price = element.getText();
			System.out.println("mobiles price :- "+price);
			boolean b1 = element.isDisplayed();
			Assert.assertTrue(b1);
		}
		
	}
}
