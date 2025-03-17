
@tag
Feature: SauceDemo	 
  

  @tag1
  Scenario Outline: Login to website
    Given User is on login page
    When User enter valid "username" and "password" 
    Then User should be redirected to the dashboard page 

