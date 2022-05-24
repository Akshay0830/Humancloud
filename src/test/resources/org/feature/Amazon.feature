
Feature: To validate the amazone homepage
  
  Scenario: Validate the search box of amazon
    Given user is on the dashboard of Amazon
    And user clicks on the search button
    When user enters iphone 13 in search tab
    And clicks on the search button
    Then user gets the list of iphone 13 mobiles
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
