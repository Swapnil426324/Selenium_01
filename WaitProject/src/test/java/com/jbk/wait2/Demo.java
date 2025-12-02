package com.jbk.wait2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void openBrowser() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=774088017322&hvpos=&hvnetw=g&hvrand=9648822214945639655&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300272&hvtargid=kwd-64107830&hydadcr=14452_2429115&gad_source=1");
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
