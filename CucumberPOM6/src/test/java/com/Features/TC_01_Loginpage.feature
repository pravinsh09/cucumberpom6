Feature: Logging into CRM



@Login
Scenario: Logging in CRM

Given verify user open crm login page 
And I enter username as password
|pravin.sh9@gmail.com|Jaya*1234|

And I click on "loginButton"
Then verify Home Page


