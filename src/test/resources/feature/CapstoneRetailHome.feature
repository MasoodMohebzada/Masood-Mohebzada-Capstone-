Feature: Capstone Retail Home

 @testall
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below option are present in shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |


  Scenario: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |
 Examples: 
 
 | department   | optionOne                      | optionTwo               |
 | 'Electronics'| TV & Video                     | Video Games             |
 | 'Computers'  | Accessories                    | Networking              | 
 | 'Smart Home' | Smart Home lighting            | Plugs and Outlets       |
 | 'Sports'     | Athletic Clothing              | Exercise & Fitness      |
 | 'Automative' | Automative Parts & Accessories | MotorCycle & Powersports|
 
 
 
 Scenario: Verify User can add an item to cart 
 Given User is on retail website 
 When User click on sign in option 
 And User enter email 's_097@yahoo.com' and password 'Masood@13'
 And User click on login button 
 Then User should be logged in into Account
 And User change the category to 'Smart Home'
 And User search for an item 'kasa outdoor smart plug'
 And User click on search icon 
 And User click on item 
 And User select quantity '2'
 And User click add to Cart button 
 Then the cart icon quantity should change to '2'
 
 
 
 Scenario: Verify User can place an order without Shipping address and payment Method on file
 Given User is on retail website 
 When User click on sign in option 
 And User enter email 's_097@yahoo.com' and password 'Masood@13'
 And User click on login button 
 Then User should be logged in into Account
 And User change the category to 'Smart Home'
 And User search for an item 'kasa outdoor smart plug'
 And User click on search icon 
 And User click on item 
 And User select quantity '2'
 And User click add to Cart button 
 Then the cart icon quantity should change to '2'
 And User click on Cart option 
 And User click Add a new address link for shipping address 
 And User fill new address form with below information 
 
|country     | fullName    | phoneNumber| streetAddress|apt      |city     |state     |zipcode
|countryValue|fullnameValue|PhoneValue  |StAddress     |aptValue |cityValue|stateValue|zipcodeValue

And User click Add Your Address button
And User click Add a credit card or Debit Card for Payment method 
And User fill Debit or credit card information 

|cardNumber   |nameOnCard| expirationMonth |expirationYear | securityCode
|9876543214569|Pantherns |  11             | 2024          | 123

And User click on Add your card button 
And User click on Place Your Order
Then a message should be displayed 'Order Placed, Thanks'

@SmokeTest
Scenario: Verify User can place an order with Shipping address and payment Method on file
 Given User is on retail website 
 When User click on sign in option 
 And User enter email 's_097@yahoo.com' and password 'Masood@13'
 And User click on login button 
 Then User should be logged in into Account
 And User change the category to 'Electronics'
 And User search for an item 'Apex Legends'
 And User click on search icon 
 And User click on item 
 And User select quantity '5'
 And User click add to Cart button 
 Then the cart icon quantity should change to '5'
 And User click on Cart option 
 And User click on Proceed to Checkout button 
 And User click on Place Your Order
 Then a message should be displayed 'Order Placed, Thanks'
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
