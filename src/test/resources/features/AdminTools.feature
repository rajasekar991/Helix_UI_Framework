Feature: Admin Tools Page Validations


Background: 
Given User is on Admin Tools Page
|username			  |password     |
|mcorry@mailinator.com|Test123Test!!|

@AdminTools
Scenario: Admin Tools Page label
Then Validate Admin Tools label on the page