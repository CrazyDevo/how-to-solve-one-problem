Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on the Google search page
    Then user should see title is Google

  @wip
  Scenario Outline: Search apple result title verification
    Given user is on the Google search page
    When user searches for <word>
    Then user should see <word> in the title
    #And user sees 3 apples
    Examples:
      | word  |
      | apple |
      | peach
