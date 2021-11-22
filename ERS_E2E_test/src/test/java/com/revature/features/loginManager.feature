Feature: Manager login 

Scenario: Manager successfully logs in (positive test)
	Given I am at the login page 
	When I enter a valid username
	And I enter in a valid password 
	Then I should be taken to the manager welcome page and be able to see my first and last name displayed in the webpage
