Feature: It contains seat booking functionality

  Scenario Outline: Flight seat booking in flyus
    Given user launches chrome and navigate to  flyus url
    When user enters source and destination& Traverler and search for flights
      | from   | to   | travelers   |
      | <From> | <To> | <Travelers> |
    When user select the flight
    And enter the below passenger information
      | first | initial | firsts     | require | address  | 
      | Loges | K       | Logeswaran | K       | Namakkal | 
      | Loges | K       | vignesh    | K       | Namakkal | 
    When user select the seat
    Then I print the price

    Examples: 
      | From      | To          | Travelers   |
      | New york  | Los Angeles | 1 Travelers |
      | Bangalore | chennai     | 1 Travelers |
