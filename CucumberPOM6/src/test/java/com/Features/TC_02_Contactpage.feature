Feature: Verify Contact page functionality


@Contact
Scenario:
Given verify user open crm login page
And I enter username as password
|pravin.sh9@gmail.com|Jaya*1234|  
And click on the contacts link
Then verify user is on contact page

@Contact
Scenario:
Given verify user open crm login page
And I enter username as password
|pravin.sh9@gmail.com|Jaya*1234|  
And click on the contacts link
And verify user is on contact page
And click on new button

@Sanity
Scenario Outline:
Given verify user open crm login page
And I enter username as password
|pravin.sh9@gmail.com|Jaya*1234| 
 
And click on the contacts link
And verify user is on contact page
And click on new button
And Enter the "<firstName>" and "<lastName>"
And Enter the department


Examples:
|firstName |lastName|
|rohit     |sharma  |
|samson    |john    |
