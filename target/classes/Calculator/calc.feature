Feature: Calculator
Perform basic calculations here.

Scenario: Addition

Given enter 50
Then press add
Then enter 50
And the result should be 100

Scenario: Subtraction

Given enter 10
Then press sub
Then enter 5
And the result should be 5