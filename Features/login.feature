#Author Hadeel
@UserLogin
Feature: User want to Sign in & Sign Off from Oscommerce

In order to Sign in and Sign Off from account
As a register user
I want to enter E-Mail Address, password, and click sign-in to login
and Click Sign Off for Sign Out

@sc1
Scenario Outline: Positive login and logout with valid E-Mail Address and Password

Given user visiting homepage
And click My Account button
When user enter "<E-Mail Address>" and "<password>"
And user click on sign in button
Then user successfully login to the system
And user click on Log off Button for logout

Examples:

| E-Mail Address       | password |
| pat@yahoo.com        | Abc123   |

#NegativeScenario1
@sc2
Scenario Outline: Negative login and logout with valid E-Mail Address and Password

Given user visiting homepage
And click My Account button
When user enter invalid "<E-Mail Address>" and valid "<password>"
And user click on sign in button
Then user successfully login to the system
And user click on Log off Button for logout

Examples:

| E-Mail Address       | password |
| pat@yahoo            | Abc123   |
#|||

#NegativeScenario3
@sc3
Scenario Outline: Negative scenario for login

Given user visiting homepage
And click My Account button
When user enter null "<E-Mail Address>" and valid "<password>"
And user click on sign in button
Then user successfully login to the system
And user click on Log off Button for logout

Examples:

| E-Mail Address       | password |
| pat@yahoo            | Abc123   |

