Feature: Manager delete request

Scenario: Manager deleting request (positive test)
	Given I am at the welcome page while logged in as a manager
	When I click the delete request button next to a request
	Then I should see a message saying the request has been deleted and see the request removed from the requests tab