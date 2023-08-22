package com.webmath_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_page {
	public static WebDriver driver;

	public void intialization(String browser) {
		if (browser.contains("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.webmath.com/index1.html");
			driver.manage().window().maximize();
		} else {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.webmath.com/index1.html");
			driver.manage().window().maximize();
		}

	}
	void closebrowser() {
		driver.close();
	}

}
