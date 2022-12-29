Feature: Retail Account Page

  Background: 
  Given User is on retail website 
	When User click on Sign in option
	And User enter email 's_097@yahoo.com' and password 'Masood@13'
	And User click on login button 
	And User should be logged in into Account 
	
	@SmokeTest
	Scenario: Verify User can update profile Information 
	When User click on Account option 
	And User update Name 'panthersTest' and Phone '2025859988'
	And User click on Update button 
	Then User profile information should be updated
	

	Scenario: Verify User can Update password
	When User click on Account option 
	And User enter below information 
	|previousPassword|newPassword|confirmPassword
	|Tek@54321       | Tek@12345 |  Tek@12345
	And User click on Change Password button 
	Then A message Should be displayed 'Password Updated Successfully'
	
	Scenario: Verify User can add a payment method 
	When User click on Account option 
	* User click on Add a payment method link
	* User fill Debit or Credit card information 
	|cardNumber   |nameOnCard| expirationMonth |expirationYear | securityCode
	|9876543214569|Pantherns |  11             | 2024          | 123
	
	* User click on Add your card button 
	Then a message should be displayed' Payment Method updated Successfully'
	
	Scenario: Verfiy User can edit Debit or Credit card 
	When User click on Account option 
	And User select card with ending '9852'
	And User click on edit option of card section
	And User edit information with below data
	
	|cardNumber |nameOnCard| expirationMonth |expirationYear | securityCode
  |7412589633698521|Pantherns |  12           | 2025          | 456
	
	And user click on Update Your Card button
	Then a message should be displayed'Payment Method updated Successfully'
	
	
	@SmokeTest
	Scenario: Verify user can remove Debit or Credit Card 
	When User click on Account option 
	And User select card with ending '8521'
	And User click on remove option of card section 
	Then payment details should be removed 
	
	
	Scenario: Verify User can add an Address 
	When User click on Account Option 
	And User click on Add address option 
	And User fill new address form with below information 
	|country     | fullName    | phoneNumber| streetAddress|apt |city     |state     |zipcode
	|countryValue|fullnameValue|PhoneValue  |StAddress|aptValue |cityValue|stateValue|zipcodeValue
	And User click Add Your Address button 
	Then a message should be displayed 'Address updated Successfully' 
	
	
	@SmokeTest
	Scenario: Verify User can edit an Address added on account
	When User click on Account option 
  And User click on edit address option 
  And user fill new address form with below information 
  |country     | fullName    | phoneNumber| streetAddress|apt |city     |state     |zipcode
	|countryValue|fullnameValue|PhoneValue  |StAddress|aptValue |cityValue|stateValue|zipcodeValue
	And User click update Your Address button 
	Then a message should be displayed 'Address Updated Successfully'
	
	
	@SmokeTest
	Scenario: Verify User can remove Address from Account 
	When User click on Account option 
	And User click on remove option of Address section 
	Then Address details should be removed
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	