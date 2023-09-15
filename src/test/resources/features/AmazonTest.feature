Feature: Test Amazon Main Page

  Scenario Outline:
    Given Amazon Home page is opened
    When Type <keyWord> into the search field
    And Click on the search button
    Then Check search result contains <keyWord>

    Examples:
      | keyWord    |
      | 'Selenium' |
      | 'iPhone'   |