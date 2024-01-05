Feature: Create a new user at UTest Website

@Test


Scenario: As an  user, enter to the UTest website and create a new user
Given The user navigates tu utest.com
And The user introduce the general information
And The user introduce the location information
And The user introduce the devices information
And The user introduce the password
Then The register of a new user is complete