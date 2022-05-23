package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppleAddtoBag {
	WebDriver driver;
	@Given("^users visit the apple home page$")
	public void users_visit_the_apple_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait( 20,TimeUnit. SECONDS);
	    driver.manage().window().maximize();
	   Thread.sleep(5000);
        driver.get("https://www.apple.com/");
	}

	@When("^user clicks the Bag option and clicks the Bag option to check all details$")
	public void user_clicks_the_Bag_option_and_clicks_the_Bag_option_to_check_all_details() throws Throwable {
	     
	}

	@Then("^user will be able to see the product in the Bag$")
	public void user_will_be_able_to_see_the_product_in_the_Bag() throws Throwable {
	   
	}


	
	
	
	
	
	
	
	
	
	
	
	

}
