Background:
Given I opened Epam web-site

# 1
Feature: Test language change
  Scenario: Test language change
    Given  I am on min page
    When I click to language button
    And Chose Ukrainian
    Then i go on Ukr Webpage
# 2
Scenario: Display office location
Given I am on the main page
* I scroll down the page
* I select Our offices Americas
* I select Canada
* I see list of cities in Canada with EPAM offices
* I select Ottawa city
When I click "MAP" link
Then My browser should open new tab with google maps
And mark the adress of office in Minsk
# 3
Scenario: Window size
Given I am on the main page
And I switch my browser from full-screen to the window mode
When I manually dicrease size of window
Then All text and sections on the site should adjust for the size of the window
And All menu options should be compressed in one button with the drop submenu
# 4
Scenario: Apply for job
Given I am on main page
* I am on the page with the list of Java vacancies
When I input "Java"
* I click button
Then I should see an information about the job
# 5
  Scenario: Find Job Offers
    Given I am on the main page
    * I click "Find your dream job" button
    When I select Location Kiev
    Then I should see all job offers in Kiev

# 6
  Scenario: Connection with Instagram
    Given I am on the main page
    And I scroll to the bottom
    When I click Instagram button
    Then Browser should redirect me to the EPAM Instagram web page in new tab
# 7
  Scenario: Using Search tool
    Given I am on the main page
    * I click on the magnifier button
    * Search menu drops down
    * I type in "Java" in search field
    When I click FIND button
    Then I should see all results of search related to the "Java"

# 8
  Scenario: Filter Insights data
    Given I am on main page
    * I go  to Insights
    When I select What’s Next for Digital Learning in 2021
    Then I must to see all the insiders in the selected category


