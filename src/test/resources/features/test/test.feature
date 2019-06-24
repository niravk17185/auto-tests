Feature: Autocomplete feature
  @smoke@regression
  Scenario: Validate user enter “A "character in search bar, Autocomplete feature(AF),provides relevant search suggestions start with character "A"
    Given user navigate to the Google landing page
    Then  user validate Google searchbar is displayed
    When user enter text "A" to search
    Then user validate "10 "max display limit of Auto Suggest lists for "A"
    Then user valiate all suggestion start from character "A"
  @smoke@regression
  Scenario: Validate user enter “a "character in search bar, Autocomplete feature(AF),provides relevant search suggestions start with character "A"
    Given user navigate to the Google landing page
    Then  user validate Google searchbar is displayed
    When user enter text "a" to search
    Then user validate "10 "max display limit of Auto Suggest lists for "a"
    Then user valiate all suggestion start from character "a"
  @regression
  Scenario: Check for case sensitivity
    Given user navigate to the Google landing page
    Then  user validate Google searchbar is displayed
    When user enter text "a" to search
    Then user validate suggested list for "A" same as for character "a"
    Then user validate suggested list for "a" same as for character "A"






