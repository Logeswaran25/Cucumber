Feature: It contains flipkart login and price checking functionality

  Scenario Outline: validate the price sorting
    Given user launche chrome
    When user enter mail as "<id>" and password as "<Password>"
    And I search the product as "<SearchTxt>"
    Then Login and validate successful

    Examples: 
      | id                      | Password   | SearchTxt |
      | logeswaran251@gmail.com | Flipkart@5 | iphone    |
      | logeswaran251@gmail.com | Flipkart@5 | laptop     |
