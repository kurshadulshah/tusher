package com.nexttechITC.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonsearchpom {

	WebDriver driver;
	  
	  //CONSTRUCTOR IS NOT A METHOD BUT A SPECIAL TYPE OF METHOD.
	//CONSTRUCTOR NAME SHOULD BE  SAME AS CLASS NAME THERE IS NO RETURN TYPE
	   public Amazonsearchpom (WebDriver driver) {
	     this.driver=driver;
	    
	     PageFactory.initElements(driver, this);
	    }
	   
	  // @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	   @FindBy(name="field-keywords") 
	   WebElement edit_serchbox;  
	   //Access modifier return type method name
	   public WebElement Search(){        //method           
	   return edit_serchbox; //attribute   
	    
	   }
	   @FindBy(id="nav-search-submit-button")
	   WebElement click_searchbutton;
	   public WebElement searchbutton(){
	   return click_searchbutton;
	    
}
}

