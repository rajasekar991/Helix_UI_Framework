#Author: Rajesh Matadh
Feature: Helix Login

@LoginHelix
Scenario Outline: Login 
Given I am on Helix login page
When title of the login page is "<title>" 
Then I enter "<username>" and "<password>" and login 
And I validate the login function
And I close the browswer

Examples:
|title					   |username             |password     |
|Test Client Speaker Bureau|mcorry@mailinator.com|Test123Test!!|
