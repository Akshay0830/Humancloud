
Feature: To validate the flipkart homepage
  
  Scenario: Validate the login of flipkart
    Given user is on the login page
    When user enters the  username
    And user enters the password
    Then user clicks on the login button
    Then user redirected to dashboard
    

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
