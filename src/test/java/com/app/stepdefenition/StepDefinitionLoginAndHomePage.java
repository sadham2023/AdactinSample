package com.app.stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionLoginAndHomePage {
	WebDriver driver = null;
	@Given("Enter the username {string}")
	public void enter_the_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password {string}")
	public void enter_the_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Enter the loginbutton")
	public void enter_the_loginbutton() {
		driver.findElement(By.id("login")).click();
	}
	@Then("Validate HomePage")
	public void validate_home_page() {
		try {
			if(driver.findElement(By.xpath("//td[contains(text(), 'Welcome')]")).isDisplayed()) {
			System.out.println("Home Page is Displayed");
			} else {
				System.out.println("Home Page is not Displayed");	
			}
		} catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}
}
