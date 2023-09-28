@regs
Feature: To validate regitor as media functionality

Scenario Outline: To validate register as a media functionality

Given To open the IATF application

When To click the Why attend option

Then Validate the Why attend page

And To click register to visit button

Then Validate register to visit page

When To click register as a media option

Then Validate the new window for register as a media

When Upload profile image for media "<Image>"

And Select title for media

And Enter first name for media "<firstName>"

And Enter Last Name for media "<Lastname>"


And Enter passport number for media "<PassportNumber>"

And Select passport issued date for media

And Select passport issues by country

And Upload passport document for media "<File>"

And Enter Email Address for media "<Email>"

And Enter mobile number for media "<PhoneNumber>"

And Click the radio button for media

And Click the privacy statement for media

And Click terms and condition button for media

And Click next button for media page one

Then Validate media registration page two



When Enter the Company name required text box for media "<Companyname>"


And Enter the media designation "<mediadesignation>"

And Enter the publication name "<Publication>"

And Enter the Company Address in required text box for media "<Line1>,<Line2>"

And Enter the City for media "<City>"

And Enter the ZIP/Postal code for media

And Select the Country/Region from Dropdown for media

And Select the State/Province from Dropdown for media

And Enter the Telephone number for media "<Telephone>"

And Enter the Email Address for media mail "<mediaEmail>"

And Enter the Company website in required text box for media "<CompanyWeb>"

And Enter about media house

And Click Publication Language of media

And Click audience Target of media

And Click audience reach of media

And Click audience segment of media

And Enter the facebook url for media "<fburl>"

And Enter the twitter for media "<Twitterurl>"

And Enter the instagram for media "<instaurl>"

And Enter the personal instragram for media "<personalinstaurl>"

And Enter the other detail for media "<otherdetail>"

And Click next button for media page two

Then Validate the media information  page media

When To Click the attending the IATF2023 media	

And To Click attending the Trade & Investment Conference media

And To Click Are you interested in attending CANEX media

And To Click attending the Africa Automotive Show media

And To Click Are you interested in attending media

And To Click Do you require a TV crew

And Click next button for media page three

And Click Submit button in media page four

Then Validate the Registration Proceed media

Examples:

|Image|firstName|Lastname|PassportNumber|File|Email|PhoneNumber|Companyname|mediadesignation|Publication|Line1|Line2|City|Telephone|mediaEmail|CompanyWeb|fburl|Twitterurl|instaurl|personalinstaurl|otherdetail|
|C:\\image\\testimage.png|Test1|Test2|4321649|C:\\image\\testimage.png|Test49jkfhrjyrcfffi@gmail.com|986543210|flipkart|media|arunodhayam|Address1|Address2|manchester|444556865|alterasdf1234@gmail.com|www.media.com|httpIATF2023comfb|httpIATF2023comtwtter|httpIATF2023cominstagram|httpIATF2023compersonal|othermedia|
