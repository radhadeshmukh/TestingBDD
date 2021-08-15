Feature: Test Background Feature

Background: User is Logged In
	Given I navigate to the login page

@SeleniumTest
Scenario: Search a product and add the first product to the User basket
	Given User search for Lenovo Laptop
	
@SeleniumTest
 Scenario: Click on  Option 
 Given click on All option
   