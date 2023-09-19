Feature: Test Amazon about search Page

  Scenario Outline:
    Given Amazon page is opened
    When Type <keyWord> into the search field
    And Click on the search button
    Then Check search result contains <keyWord>

    Examples:
      | keyWord    |
      | 'Selenium' |
      | 'iPhone'   |

