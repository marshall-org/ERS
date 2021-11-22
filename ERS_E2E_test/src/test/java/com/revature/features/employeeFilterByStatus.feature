Feature: Employee filter by status

Scenario: Show only pending requests (positive test)
	Given I am at the welcome page while logged in as an employee
	When I select pending requests from the filter menu 
	Then I should see only my own pending requests

Scenario: Show only approved requests (positive test)
	Given I am at the welcome page while logged in as an employee
	When I select approved requests from the filter menu 
	Then I should see only my own approved requests

Scenario: Show only denied requests (positive test)
	Given I am at the welcome page while logged in as an employee
	When I select denied requests from the filter menu 
	Then I should see only my own denied requests
