  Feature: Login by using valid data
  
  Scenario Outline: Register with valid data
    Given opens testme application
    When user enters username as "<username>" and password as "<password>" 
    And click on Login button
    Then verify it displays Home page

    Examples: 
      |username|password|
      |manoshine|manoshinee|