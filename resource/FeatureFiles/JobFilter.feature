@regression
Feature: Job location outline

  @tag2
  Scenario Outline: Search for job with location
    Given user is on Chase homepage
    When user click on career
    And user clicks on explore opportunities
    And user clicks on view all jobs 
    And user search for "<Role>"
    Then verify by "<Role>" results

    Examples: 
      | Role 									| Results           | 
      | Software Engineering  | Positive scenerio | 
      | Spiderman  						| Negative scenerio | 
      | &%%&%$							  | Boundary scenerio | 