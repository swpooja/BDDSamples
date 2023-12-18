@PhaseOne
Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Deals
Given User is logged in
When User create a new Deals

@RegressionTest
Scenario: View Deals
Given User is logged in
When User view Deals details

Scenario: Delete a Deals
Given User is logged in
When User delete a Deals
