@sc2
Feature:  user want to visit amazon web page and verify search

 In order to verify search 
 as a register user 
 i want to visit amazon web page and write a text in search box then search
  
 Scenario Outline: 
 Given user visit amazon home page
 When user WILL search by "<productname>" 
 Then user will click on search button
 
 
Examples:
|productname| 
|iphone12 pro max|
 