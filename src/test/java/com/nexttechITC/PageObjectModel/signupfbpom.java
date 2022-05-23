package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupfbpom {
	
	WebDriver driver;
	
	
  public signupfbpom(WebDriver driver) {
 this.driver=driver;
 PageFactory.initElements( driver, this);
	
	   }
  
   
   @FindBy(xpath="//input[@id=\"u_0_j_pa\"]" )
//	@FindBy(name="fristname")   
   WebElement edit_firstname;
	public WebElement firstname() {
	   return firstname();
	     }
	   @FindBy(name="lastname")
	   WebElement edit_lastname;
	   public WebElement lastname() {
	   return  edit_lastname;
	      }
	        
	   @FindBy(name="reg_email")
	   WebElement edit_email;
	   public WebElement email() {
	   return  edit_email;
	   }
	   
	  
  @FindBy(id="password_step_input")
	    WebElement edit_password;
	    public WebElement password() {
	    return  edit_password;
	        }
     
	    @FindBy(xpath="//*[@id=\"month\"]")
		WebElement click_month;
    
	      public WebElement month() {
	    	  return click_month;
	      }
	        
	         
	    @FindBy(id="day")
		
	     WebElement click_day;
    
	    public WebElement day() {
	    return click_day;	
	    }
	           
	            
    @FindBy(id="year")
	
	    WebElement click_year;
    
	    public WebElement yeaar() {
	    	return click_year;		
			}
	
	    
	    
	    
	    
}
