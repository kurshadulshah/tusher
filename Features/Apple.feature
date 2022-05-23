 @se3
 Feature: Apple feature
 In order to add Apple MacboookPro into the Bag
 as a user, I want to visit the Apple Home page and click the mac icon and click MacBook Pro and click the BUY option under the Superched for pros    
 I want to select 14-inch and select 10-Core and from the dropdown chose Arabic
and click Add to Bag and click Review Bag.
   
 @Apple
 Scenario Outline: 
 Given user visit Apple home page
 When user click on search icon and type "<search word>" and user will click MacBook Pro
 And user will see "<MacBook Pro-14 inch>" 
 When user chose 10-core and click Buy and Select and the user select Arabic Keyboard language and click Add to Bag  
 When user click Review Bag
 Then user will be able to see the product has been added to the Bag
  Examples: 
|search word|
|MacBook Pro|