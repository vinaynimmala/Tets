package com.vlabs.qa.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		System.out.println("Opening browser");
System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver-v0.19.0-win64\\geckodriver.exe");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay.nimmala\\Desktop\\LE\\chromedriver.exe");

	}

}
