Feature: Hover Test

Scenario Outline: Hovering over Official Merchandise

Given User lands on Home Page
And visit create account page
When the <FirstName> <LastName> <Email> and <Password> are entered
Then user will be registered and logged in


	
Examples:

|FirstName	|LastName	|Email								|Password	|
|chaitya		|shah			|bddcase11@gmail.com	|12345678	|
|12					|2				|bddcase21@gmail.com	|12345678	|