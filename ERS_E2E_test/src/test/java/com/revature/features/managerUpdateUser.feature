#I think the only thing I manager should be able to do to other people's account is make them a manager as well. So I think thatll 
#be the only scenario I have here for now.

Feature: Manager changing user role

Scenario: Manager changing employee to manager (positive test)
	Given I am at the manager update account page
	When I select manager role from the selection menu
	And I click the submit button
	Then I Should see a message saying employee account has been successfully updated

Scenario: Manager changing manager role to employee (positive test)
	Given I am at the manager update account page
	When I select employee role from the selection menu
	And I click the submit button
	Then I Should see a message saying employee account has been successfully updated
	
Scenario: Manger access employee update page (positive test)
	Given I am at the welcome page while logged in as a manager
	When I select the employee tab
	Then I should be taken to the employees list page
	