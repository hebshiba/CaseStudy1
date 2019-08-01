
Feature: 

  Scenario: The one Where the user moves to cart without adding any item in it
    Given user has registered in to TestMeApp
    When user search a particular product like headphones
    And try to proceed to payment without adding any item in the cart
    Then Application doesn't display the cart icon
