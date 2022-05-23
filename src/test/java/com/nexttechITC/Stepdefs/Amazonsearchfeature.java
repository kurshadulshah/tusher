package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.Amazonsearchpom;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearchfeature {
	
WebDriver driver;

	@Given("^user visit amazon home page$")//step
	public void user_visit_amazon_home_page() throws Throwable{
	//method user visit amazon is a method name
		//how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts() .implicitlyWait(20,TimeUnit.SECONDS);
//how to open the URL
		driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);   
	}

	@When("^user WILL search by \"([^\"]*)\"$")
	public void user_WILL_search_by(String arg1) throws Throwable {
//  object name AS we gonna criet in the stePDEff method from where we will get the web element
//	there is a POM  class so  we are creating  a obj where we have 	our web elament
		Amazonsearchpom AS= new Amazonsearchpom (driver);
		AS.Search().sendKeys(arg1);
	   
//	    throw new PendingException();
		
		Thread.sleep(5000);
			   
	}
	@Then("^user will click on search button$")
	public void user_will_click_on_search_button() throws Throwable {
		Amazonsearchpom AS= new Amazonsearchpom (driver);
		AS.searchbutton().click();
	  WebDriverWait wait= new WebDriverWait(driver,20);
	  Thread.sleep(10000);  
	}

 
}
