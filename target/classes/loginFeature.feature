Feature: BackOffice Login

Scenario: Successful Login with Valid Credentials
Given User is on Login Page
When User enters valid UserName and Password
Then User is presented in the Home Page

Scenario: Login with invalid credentials
Given User is on Login Page
When User enters invalid UserName and/or Password
Then User is presented in the Login Page
And Invalid credentials error message is displayed

Scenario: User request password providing an invalid username
Given User is on Login Page
And User clicks on the Forgot your password link
When User requests password providing an invalid username
Then User is presented in the Forgot Password Page
And Invalid username error message is displayed