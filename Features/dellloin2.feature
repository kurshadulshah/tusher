 Feature: Dell Log in 
As a user I want to visit dell homepage
I want to click on Sign In
And I want to Creat an Anccount. 

@test3
Scenario Outline:  Go to dell homepage
    Given user have access to dell home page
    When I want to Create an account
    Then  user enter "<First name>" and"<Last name>" and valid "<email address>" and "<new password>"
    When I create my account I want to type search for vostro 7510 laptop and add laptop to my card

    Examples: 
      |First name  | Last name| email address         |new password| laptop            |
	    |selina      | Akther   |selina111sa@gmail.com  |Aayan123    |vostro 7510 laptop |
 
