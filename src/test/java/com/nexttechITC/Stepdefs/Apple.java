package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.ApplePOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Apple {
	
	WebDriver driver;
	private WebElement keyboardlanguage;
	
	@Given("^user visit Apple home page$")
	public void user_visit_Apple_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get("https://www.apple.com/");
        driver.manage().window().maximize();
      //  Thread.sleep(5000);  
    	driver.manage().timeouts() .implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("^user click on search icon and type \"([^\"]*)\" and user will click MacBook Pro$")
	public void user_click_on_search_icon_and_type_and_user_will_click_MacBook_Pro(String arg1) throws Throwable {
		ApplePOM AP=new ApplePOM(driver);
		
		AP.searchbox().click();
		Thread.sleep(5000);
		Actions A=new Actions(driver);
		A.moveToElement( AP.searchbox()).sendKeys( "MacBookpro").click().build().perform();
		AP.MacBookpro().click();
		Thread.sleep(2000);
	 
	}

	@When("^user will see \"([^\"]*)\"$")
	public void user_will_see(String arg1) throws Throwable {
		ApplePOM AP=new ApplePOM(driver);  
		AP.Buy().click();
		Thread.sleep(2000);
		
	}

	@When("^user chose (\\d+)-core and click Buy and Select and the user select Arabic Keyboard language and click Add to Bag$")
	public void user_chose_core_and_click_Buy_and_Select_and_the_user_select_Arabic_Keyboard_language_and_click_Add_to_Bag(int arg1) throws Throwable {
		ApplePOM AP=new ApplePOM(driver); 
		AP.Select().click();
 
		Select k=new Select(AP.keyboardlanguage());
		k.selectByIndex(1);
		Thread.sleep(1000);
		
		
		//Select select= new Select(AP.customize_user()) ;
	//	Thread.sleep(1000);
		//select.selectByIndex(1 );
		
		
		AP.AddtoBag().click();
		
		Thread.sleep(2000);
	}

	@When("^user click Review Bag$")
	public void user_click_Review_Bag() throws Throwable {
		ApplePOM AP=new ApplePOM(driver); 
		AP.RevewBag().click();
		
	Thread.sleep(5000);
	
	
	
	}

	@Then("^user will be able to see the product has been added to the Bag$")
	public void user_will_be_able_to_see_the_product_has_been_added_to_the_Bag() throws Throwable {
  
	driver.quit();	
	}



}
