@exhibit
Feature: To test IATF application

Scenario Outline: To test the Register the exhibit option

Given Open the IATF application
When To click Register To exhibit option
And To select the title
And To enter the firstname "<firstname>"
And To enter the last name "<lastname>"
And To enter the company "<company>"
And To select the country
And To enter phone number "<phone>"
And To enter Mobilenumber "<mobile>"
And To enter email "<email>"
And To enter Website "<website>"
And To select the industry
And To select the intrests area
And To click the checkbox
And To click SubmitButton
Then To verify thankyou page

Examples:

|firstname|lastname|company|phone|mobile|email|website|
|test1|test2|test3|9876543210|9876543201|test@gmail.com|www.test.com|