package com.vlabs.qa.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vlabs.qa.base.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base {

	private Base base;
	
	public Hook(Base base) {
	this.base=base;
	}

	@Before
	public void initializeTest() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Automation\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinay.nimmala\\Desktop\\LE\\chromedriver.exe");
		driver = new FirefoxDriver();
		// driver.get("https://www.google.com/");
		System.out.println("Opening browser");
	}

	@After
	public void tearDown() {
		driver.close();
		System.out.println("Closing browser");
	}
}
