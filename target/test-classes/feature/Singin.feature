Feature: Sign In Feature



Background:
	Given User is on retail website 
	When User click on Sign in option
@signInTest
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'masood@yahoo.com' and password 'Masood@13'
    And User click on login button
   # Then User should be logged in into Account
    
    
  Scenario Outline: Verify user can login with different email and pass
    Given User is on retail website
    When User click on Sign in option
    And User enter email <email> and password <password>
    And User click on login button
    Then User should be logged in into Account
    Examples: 
    |email              |password  |
    |'masood@yahoo.com' |Masood@13'|
    |'ahmad@yahoo.com'  |Ahmad@13' |
    |'Jawad@yahoo.com'  |Jawad@13' |
  
    Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button 
    And User fill the signUp information with below data 
    
    |name  |email           |password |confirmPassword|
    |Masood|masood@yahoo.com|Masood@13| Masood@13     |
    And User click on SignUp button 
    Then User should be logged into account page
    
