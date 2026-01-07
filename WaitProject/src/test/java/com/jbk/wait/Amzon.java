package com.jbk.wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amzon {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=15718452798702295978&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300272&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	// implicit wait
	@Test
	public void test01() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile cover");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-4-announce")).click();

	}

}
