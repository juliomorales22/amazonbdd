Feature: Test Amazon location city

  Scenario:
    Given Amazon page is opened
    When  Click on the location button
    And Write post code '29640'
    And  Click on the confirm Post Code button
    Then Check ciudad location is 'Fuengirola'