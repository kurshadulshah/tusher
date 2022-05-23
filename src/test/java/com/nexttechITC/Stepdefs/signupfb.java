
package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.signupfbpom;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signupfb {
	
 
	 WebDriver driver;

	 @Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/signup");

	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		signupfbpom obj=new signupfbpom (driver);
		obj.firstname().sendKeys( arg1);
	    obj.lastname().sendKeys(arg2);
	    obj.email().sendKeys(arg3);
	    obj.password().sendKeys(arg4);
	     
	}
}
//	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	//public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	//signupfbpom se1= new signupfbpom (driver);
	
	//Select dropdown = new Select(se1.click_month);
//	 dropdown.selectByValue("6")
	//dropdown.selectByIndex( 5);	
		    
//	Select dropdown1 = new Select(se1.click_day);	
	//dropdown1.selectByValue( "6");
	 	
//	Select dropdown2= new Select (se1.click_year);
	//dropdown2.selectByVisibleText("1997");
		
//	}
	

	//}



