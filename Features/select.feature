#Author Hadeel
@UserLogin
Feature: User wants to create an account on Oscommerce

In order to create an account on Oscommerce
As a register user
I want to enter my account information
and Click Continue to create an account

@SignUpSelect
Scenario Outline: Positive sign up with valid data and select action

Given user visiting homepage1
When click My Account1 button
When user clicks continue button
When user clicks respective Gender
When user enter "<First Name>", "<Last Name>", "<Date of Birth>", "<E-Mail Address>", "<Company Name>", "<Street Address>", "<Suburb>" , "<Post Code>", "<City>" , "<State/Province>" , "<Country>"
When user selects Country 
When user enter "<Telephone Number>" , "<Fax Number>"
When user click on Newsletter 
When user enters "<Password>" and "<Password Confirmation>"
When user click on Continue
Then user successfully signs up on Oscommerce


Examples:

|First Name|Last Name|Date of Birth  |E-Mail Address  |Company Name|Street Address  |Suburb |Post Code |City   |State/Province|Telephone Number|Fax Number |Password   |Password Confirmation |
|Alexander |Brown    |01/01/2001     |alex1@yahoo.com |NextTech    |1111 Blue Street|DFW    |77711     |Irving |Texas         |444-444-4444    |123456789  |Abc1234    |Abc1234               |