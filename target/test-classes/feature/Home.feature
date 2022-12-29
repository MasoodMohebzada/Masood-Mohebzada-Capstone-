Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @test @smoketest
  Scenario: Verfiy Retail Page logo
    Then User verify retail page logo as present

  @search
  Scenario: Verify User can Search in Electronic Department
    When User change the category to 'Electronics'
    And User search for an item 'PlayStation'
    And User click on search icon
    Then Item should be present

  @test1 @smoketest
  Scenario: Verify User can click on All section
    When User click on All section
    Then User verifies 'Shop by department' is present

  @testCart
  Scenario: Verify Cart icon is present
    Then User verifies cart icon is present
