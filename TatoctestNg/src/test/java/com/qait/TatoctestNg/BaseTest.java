package com.qait.TatoctestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class BaseTest {
    public WebDriver driver;
	public Keyword key;
	@BeforeClass(groups = {"Default-group"})
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/eclipse-workspace/selenium/chromedriver");
		driver = new ChromeDriver();
	     key = new Keyword(driver);

	}
	
	@AfterClass(groups = {"Default-group"})

	public void afterClass() {
		driver.quit();

	}
}
