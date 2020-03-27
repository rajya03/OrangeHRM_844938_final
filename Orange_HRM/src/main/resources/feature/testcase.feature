@OrangeHRM_Feature
Feature: OrangeHRM Website

@Tc_01_OrangeHRMLogin 
Scenario: To check that the application is taking the valid credentials.

Given user launch the chrome browser
When user open the orange hrm login page
Then user enter the username and password with valid data
Then user submit the details

@Tc_02_searching_candidate_details
Scenario: To Check if the application is searching candidate details in the Recruitment page.

Given user Launch the chrome browser
When user Open the orange hrm login page
Then user Enter the username and password with valid data
Then user Submit the details
Then user searching the candidate details

@Tc_03_reset_candidate_details
Scenario: To check if the application is reset the candidate details in the Recruitment page.
Reset Candidate details in the Recruitment page

Given  the user Launch the chrome browser
When the user Open the orange hrm login page
Then the user Enter the username and password with valid data
Then the user Submit the details
Then the user reset the candidate details

@Tc_04_add_another_candidate_details
Scenario: To check that the application add another Candidate details in the Recruitment page.

Given User Launch the chrome browser
When User Open the orange hrm login page
Then User Enter the username and password with valid data
Then user should Submit the details
Then user Searching the candidate details
And add another candidate details

@Tc_05_search_vacancies
Scenario: To check that the application  Searching Vacancies in the Recruitment page.

Given User launch the chrome browser
When User open the orange hrm login page
Then User enter the username and password with valid data
Then User submit the details
Then User searching the vacancies 

@Tc_06_add_vacancies_candidate_details
Scenario: To check that the application add candidate details in vacancies in the recruitment page.

Given User Launch the Chrome browser
When User Open the Orange hrm login page
Then User Enter the Username and password with valid data
Then user Should Submit the details
Then user Searching the Candidate details
And add candidate details 










