@PhaseOne
Feature: Contacts CRUD Management

@SmokeTest @RegressionTest
Scenario: Create a new Contact
Given User is logged in
When User create a new contact


Scenario: View Contact
Given User is logged in
When User view contact details

Scenario: Delete a Contact
Given User is logged in
When User delete a contact
