Feature: Logging into CRM



@Login
Scenario: Logging in CRM

Given verify user open crm login page 
And I enter username as password
|pravin.sh9@gmail.com| |

And I click on "loginButton"
Then verify Home Page


