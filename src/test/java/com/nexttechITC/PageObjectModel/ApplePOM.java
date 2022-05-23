package com.nexttechITC.PageObjectModel;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePOM {
	
	WebDriver driver;
	
	
	public ApplePOM(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver,this);
		 
	}
	
	@FindBy(xpath="//a[@id='ac-gn-link-search']")
	  WebElement click_serchbox; 
	public WebElement searchbox() {
		return click_serchbox;	
		}
	
	@FindBy(xpath="//input[@id='ac-gn-searchform-input' ]")
	 WebElement edet_searchword;
	public WebElement searchword() {
		return edet_searchword;
		
	}
	
	@FindBy(xpath=" //a[@data-label='MacBook Pro']")
	WebElement click_MacBookPro;
	public WebElement MacBookpro() {
		return click_MacBookPro; 
		
	}
	
	@FindBy(xpath="//a[@aria-label='Buy the MacBook Pro 14 and 16-inch']")
	WebElement click_MackBook;
	public WebElement MackBook() {
	return click_MackBook;
	}
	
	
	@FindBy(xpath="//a[@aria-label='Buy the MacBook Pro 14 and 16-inch']")
	WebElement click_Buy;
	public WebElement Buy() {
		return click_Buy;
		
	}
	
	@FindBy(xpath="(//button[@name='proceed'])[4]")
	WebElement click_Select;
	public WebElement Select() {
		return click_Select;
		
	}


	 
	  @FindBy(xpath= "//select[@class='form-dropdown-select'] ")
	    WebElement clic_keyboardlanguage;
	    public WebElement keyboardlanguage() {
			return clic_keyboardlanguage;
	    	
	    }
	  //  @FindBy(xpath="(//select[@id='6bd6dd52-d46d-11ec-b3c3-2f17cfb55456'])[1]")
	 //   WebElement customize_user;
	  //  public WebElement customize_user() {
			//return customize_user;
		//	}
	    
	    
	    
	    
	    @FindBy(xpath="//button[normalize-space()='Add to Bag'] ")
       WebElement click_AddtoBag; 
    	public  WebElement AddtoBag() {
		return click_AddtoBag;
      }

    	@FindBy(xpath="//button[normalize-space()='Review Bag']")
    	WebElement click_ReviewBag;
    	public WebElement RevewBag() {
			return click_ReviewBag;
    	
}
    	
    	
    	
    	
    	
    	
}