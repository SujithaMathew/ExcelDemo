Feature: Application login

Scenario: Homepage login

Given User is a Netbanking login page
When User login into application with "suji" and "1234"
Then Homepage is populated
And Cards displayed are "true"

Scenario: Homepage login
Given User is a Netbanking login page
When User login into application with "sowmi" and "6789"
Then Homepage is populated
And Cards displayed are "false"

