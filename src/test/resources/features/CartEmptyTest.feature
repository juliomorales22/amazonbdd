Feature: Test if cart is empty

  Scenario:
    Given Amazon page is opened
    When  Click on the cartLink
    Then Check cart is empty
