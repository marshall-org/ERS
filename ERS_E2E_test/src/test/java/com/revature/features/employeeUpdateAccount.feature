Feature: Employee updating own account

Scenario: Employee accessing update account page (positive test) 
	Given I am at the welcome page while logged in as an employee
	When I click on the update account button 
	And I successfully verify my current password
	Then I should be taken to the update account page
	
Scenario: Employee accessing update account page with invalid password (negative test)
	Given I am at the welcome page while logged in as an employee
	When I click on the update account button 
	And I give the wrong current password
	Then I should see a message saying current password is incorrect 
	
Scenario: Employee successfully updating account (positive test)
	Given I am at the employee update account page 
	When I enter in a new first name
	And I enter in a new last name
	And I enter in a new valid email
	And I enter in a new password
	Then I should see a message saying account has been successfully updated and I see should my account information has changed
	
Scenario: Employee gives invalid email (negative test)
	Given I am at the welcome page while logged in as an employee
	When I enter in a new first name 
	And I enter in a new last name
	And I enter in a new invalid email
	And I enter in a new password
	Then I should see a message saying cannot update account, new email is invalid