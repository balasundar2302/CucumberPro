Feature: Hotel Booking using Adactin

Scenario Outline: User Do Login In This App
Given user Launch The Browser
When user Enter The "<username>" and "<password>"
And user Click The Button Of Login And Navigated To The Home page

Examples:
|username  | password|
|Bala112233|	 B953RN|
|Bala012345|	 B953RN|