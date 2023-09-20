Feature: Test Amazon to find city with the post code

  Scenario:
    Given Amazon page is opened
    When  Click on the location button
    And Type post code '29640'
    And  Click on the confirm Post Code button
    Then Check city is 'Fuengirola'
