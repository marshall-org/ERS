Feature: Manager approve or deny request

Scenario: Manager approves request (positive test)
	Given I am at the welcome page while logged in as a manager
	When I select approve request from one of the request drop down menues
	And I select submit
	Then I should see a message saying the request has been approved
	
Scenario: Manager denies request (positive test)
	Given I am at the welcome page while logged in as a manager
	When I select deny request from one of the request drop down menues
	And I select submit
	Then I should see a message saying the request has been denied
