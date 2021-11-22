Feature: Employee update request

Scenario: Request updated by employee (positive test)
	Given I am at the update request page
	When I enter in a valid amount in the amount field
	And I enter in a valid description in the description field
	And I select a valid type
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message informing me the request has been updated
	
Scenario: Trying to update to zero or negative amount (negative test)
	Given I am at the update request page
	When I enter in an amount equal to or less than zero
	And I enter in a valid description in the description field
	And I select a valid type
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message saying request amount can not be equal to or less than zero 
	
Scenario: Trying to update without type specified (negative test)
	Given I am at the update request page
	When I enter in a valid amount in the amount field
	And I enter in a valid description in the description field
	And I select an invalid type
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message informing me I must select a valid type

Scenario: Trying to update without a description (negative test) 
	Given I am at the update request page
	When I enter in a valid amount in the amount field
	And I enter in nothing for the description
	And I select a valid type
	And I attach a valid receipt
	And I click the submit button
	Then I should see a message saying please provide a description for request
