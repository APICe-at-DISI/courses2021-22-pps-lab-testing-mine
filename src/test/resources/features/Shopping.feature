Feature: Shopping

  Scenario: I want to add an item to cart
    Given a warehouse
    And my initially empty cart
    When I add one item
    And the item is present in the warehouse
    Then I should have a cart with one item