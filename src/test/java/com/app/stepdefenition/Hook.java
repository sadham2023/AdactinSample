package com.app.stepdefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Hook {
	@Before
	public static void browserLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
}
