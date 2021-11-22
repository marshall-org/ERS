Feature: Employee delete request

Scenario: Employee deleting own request (positive test)
	Given I am at the welcome page while logged in as an employee
	When I click the delete request button next to a pending request
	Then I should see a message saying the request has been deleted and see the request removed from the requests tab


