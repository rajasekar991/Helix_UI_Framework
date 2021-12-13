#Author: Rajesh Matadh
Feature: Helix Login

@LoginHelix
Scenario Outline: Login 
Given I am on Helix login page
When title of the login page is "<title>" 
Then I enter "<username>" and "<password>" and login 
Then I validate the login function with "<welcomeMessage>"
And I close the browswer

Examples:
|title					   |username             |password     | welcomeMessage |
|Test Client Speaker Bureau|mcorry@mailinator.com|Test123Test!!| Welcome, Merrill |
