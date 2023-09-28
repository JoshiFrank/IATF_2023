@fe1
Feature: To validate conference delegate functionality

Scenario Outline: To validate register as a conference delegate functionality

Given To open the IATF application

When To click the Why attend option

Then Validate the Why attend page

And To click register to visit button


When To click register as a conference delegate option


And Upload profile image for conference delegate "<Image>"

And Select gender for conference delegate

And Select title for conference delegate

And Enter first name for conference delegate "<firstName>"

And Enter Last Name for conference delegate "<Lastname>"


And Enter Email Address for conference delegate "<Email>"

And Select country code for conference delegate

And Enter mobile number for conference delegate "<PhoneNumber>"

And Enter passport number for conference delegate "<PassportNumber>"

And Select passport issued date for conference delegate

And Select passport expiry date for conference delegate

And Upload passport document for conference delegate "<File>"

And Enter emergency contact name for conference delegate "<ContactName>"

And Select emergency contact country code for conference delegate

And Enter emergency contact number for conference delegate "<ContactNum>"

And Enter emergency contact relationship for conference delegate "<Relation>"

And Click next button for conference delegate page

When Enter the Company name required text box conference delegate "<Companyname>"

And Enter the Job title  conference delegate "<JobTitle>"

And Enter the Company Address in required text box conference delegate "<Line1>,<Line2>"

And Enter the City conference delegate "<City>"

And Enter the ZIP/Postal code conference delegate

And Select the Country/Region from Dropdown conference delegate

And Select the State/Province from Dropdown conference delegate

And Enter the Company website in required text box conference delegate "<CompanyWeb>"

And Enter the Telephone number(office/landline) conference delegate "<Telephone>"

And Select the Country of principle office from the Dropdown conference delegate

And Select the Country of Head office from the Dropdown conference delegate

And Enter the Alternate Contact Name conference delegate "<Altername>"

And Enter the Alternate Contact Number conference delegate "<AlterNumer>"

And Enter the Alternate Email Address conference delegate "<AlterEmail>"

And Click the Required Radio button for Eastern Africa

And Click next button for conference delegate two

When Select the Size of your Company from Dropdown conference delegate


And Select Parchasing amount of your Company from Dropdown conference delegate

And Select Annual turnover of your Company conference delegate

And Click Required Business Objectives conference delegate

And Click next button for conference delegate Three

When Select the Required sessions you'd like to attend conference delegate

And Click next button for conference delegate four

And Click Submite button conference delegate five

Then Validate the Registration successfull conference delegate 

Examples:
|Image|firstName|Lastname|Email|PhoneNumber|PassportNumber|File|ContactName|ContactNum|Relation|Companyname|JobTitle|Line1|Line2|City|CompanyWeb|Telephone|AlterEmail|Altername|AlterNumer|
|C:\\image\\testimage.png|Test1|Test2|Test97hfhkkdkkjtljihgfefi@gmail.com|986543210|4321649|C:\\image\\testimage.png|amazon|98765432156|Relation|sampleCompany|Tester|Address1|Address2|denmork|www.company.com|9876543210|alter123@gmail.com|AlterName|987654320|