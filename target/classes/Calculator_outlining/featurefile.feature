Feature: Calculator
Perform basic calculations here.

Scenario Outline: Calculation

Given enter <num1>
Then press "<operator>"
Then enter <num2>
And the result should be <result>

Examples:
|num1|num2|operator|result|
|5|5|+|10|
|5|3|-|2|
|5|2|*|10|
|5|5|/|1|