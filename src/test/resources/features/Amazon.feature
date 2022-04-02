Feature: It contains amazon search functionality

  Scenario Outline: Search products in amazon
    Given user launche the chrome and navigate to url
    When user search the product  as "<SearchTxt>"
    Then print all names & price 

    Examples: 
      | SearchTxt |
      | iphone    |
      | keyboard  |
      | Laptop    |
