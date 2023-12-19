@PhaseTwo
Feature: Tasks CRUD Management

Background: Valid Login
Given User is logged in

@SmokeTest
Scenario: Create a new Tasks
When User create a new Tasks

@RegressionTest
Scenario: View Tasks
When User view Task details

Scenario: Delete a Tasks
When User delete a Tasks
