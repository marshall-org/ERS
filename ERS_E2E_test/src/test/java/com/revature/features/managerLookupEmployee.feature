Feature: Manager lookup employee

Scenario: Manager looks up existing employee by ID (positive test)
	Given I am at the welcome page while logged in as a manager
	When I enter in a valid employee ID in the employee search bar 
	Then I should see all requests related to that employee
	
Scenario: Manager looks up invalid employee by ID (negative test)
	Given I am at the welcome page while logged in as a manager
	When I enter in an invalid employee ID in the employee search bar 
	Then I should see a message stating that that employee does not exist