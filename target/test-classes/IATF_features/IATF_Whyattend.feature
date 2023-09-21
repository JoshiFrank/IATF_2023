Feature: To validate why attend functionality

Scenario: To test Whyattend page

Given To open the IATF application
When To click the Why attend option
Then Validate the Why attend page
Then Validate the Why attend five reason banner
Then validate five banners
Then validate dont miss your moment banner


Scenario Outline: To validate register as a visitor functionality
Given To open the IATF application
When To click the Why attend option
Then Validate the Why attend page
And To click register to visit button
Then Validate register to visit page
And To click register as a visitor option
Then Validate the new window for register as a visitor
And Upload profile image for visitor "<Image>"
And Select gender for visitor
And Select title for visitor
And Enter first name for visitor "<firstName>"
And Enter Last Name for visitor "<Lastname>"
And Select DOB for visitor
And Select Language for visitor
And Enter Email Address for visitor "<Email>"
And Select country code for visitor
And Enter mobile number for visitor "<PhoneNumber>"
And Enter passport number for visitor "<PassportNumber>"
And Select passport issued date for visitor
And Select passport expiry date for visitor
And Upload passport document for visitor "<File>"
And Enter emergency contact name for visitor "<ConatctName>"
And Select emergency contact country code for visitor
And Enter emergency contact number for visitor "<ContactNum>"
And Enter emergency contact relationship for visitor "<Relation>"
And Click next button for visitor page
Then Validate visitor registration page two
When Enter the Company name required text box "<Companyname>"
And Enter the Job title "<JobTitle>"
And Enter the Company Address in required text box "<Line1>,<Line2>"
And Enter the City "<City>"
And Enter the ZIP/Postal code
And Select the Country/Region from Dropdown
And Select the State/Province from Dropdown
And Enter the Company website in required text box "<CompanyWeb>"
And Enter the Telephone number(office/landline) "<Telephone>"
And Select the Country of principle office from the Dropdown
And Select the Country of Head office from the Dropdown
And Enter the Alternate Email Address "<AlterEmail>"
And Enter the Alternate Contact Name "<Altername>"
And Enter the Alternate Contact Number "<AlterNumer>"
And Click the Required Radio button for What is your purchasing power Queation
And Click the Required Radio button for What are your motivations for visiting
And Click the Required Radio button for What are the main geographical regions that you are interested in
And Click next button for visitor page2
Then Validate the User Navigate to the BUSINESS INFORMATION page
When Select the Size of your Company from Dropdown
And Click the Required Radio button for What is the main activity of your company
And Select your position in company from the Dropdown
And Select Parchasing amount of your Company from Dropdown
And Select Annual turnover of your Company
And Click Required Business Objectives
And Click next button for visitor page3
Then User Navigate to registration for iatf2023
When Select the Required sessions you'd like to attend
And Click the required Answare for Online Diary and Virtual Trade Fair Admissions Policy
And Click the Admission Policy Check box
And Click InviteOthers
Then Validate the Invite Others popup
When Enter the Required Details for Invite Others
And Click the AddInvitee Button
And Click Confirm Invite Button
Then Validate the Invitation Ready PopUp Shoulde be Displayed
When Click next button
And Click Submite button
Then Validate the Registration Proced



Examples:
|Image|firstName|Lastname|Email|PhoneNumber|PassportNumber|File|ConatctName|ContactNum|Relation|Companyname|JobTitle|Line1|Line2|City|CompanyWeb|Telephone|AlterEmail|Altername|AlterNumer|
|C:\\image\\testimage.png|Test1|Test2|Test2hhilh@gmail.com|986543210|4321649|C:\\image\\testimage.png|flipkart|98765432156|Relation|sampleCompany|Tester|Address1|Address2|denmork|www.company.com|9876543210|alter123@gmail.com|AlterName|987654320|