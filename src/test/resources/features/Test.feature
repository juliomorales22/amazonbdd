Feature: Test Amazon Main Page

  Scenario:
    Given Amazon Home page is opened
    When Type 'sillon' into the search field
    And Click on the search button
    Then Check search result contains 'keyWord'