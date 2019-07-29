@sanity
Feature: Create lists

  Background:
    Given I am on the domain page
    And I add "rainforestqa.staging" as my domain

  Scenario: Create 2 new lists and delete 1
    Given I am on the sign in page
    And I add "tom.mck" as username
    And I add "tom.mck" as password
    When I sign-in
    Then the bottom right button displays "tom.mck@fakemail.com" address at the top