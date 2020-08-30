#Author Hadeel
@UserLogin
Feature: User wants to submit a message to Oscommerce through Contact Us page

In order to send a message to oscommerce through Contact Us page
As a user
I want to click Contact Us and enter Full Name, E-Mail Address, Enquiry
and Click Continue to submit message


Scenario Outline: Positive validation of Contact Us valid Full Name, E-Mail Address and Enquiry

Given user visits homepage
And click Contact Us button
When user enters "<Full Name>" and "<E-Mail Address>" and "<Enquiry>"
And user click on Continue button
Then user successfully submit message to oscommerce

Examples:

| Full Name | E-Mail Address       | Enquiry  |
| Pat Don   | pat@yahoo.com        | Hi sir   |