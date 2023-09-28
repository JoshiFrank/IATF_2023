@ff1
Feature: To Validate the Exhibitors functionality

Scenario: To validate the exibitors page

Given To open the IATF application
When To click the Exhibitors button
And To click the exibitors Right arrow
Then Validate exibitors Page

When Click registor to visit in exibitors link
Then Validate registor to visit page in exibitors 
When To navigate back
When To click VIEW EXHIBITOR STAND PACKAGES link
Then Validate the PDF of VIEW EXHIBITOR STAND PACKAGES  
When To click book to exhibit in exhibitors page
Then Validate book to exhibit register page in exhibitors
When To navigate back
When To click Download the exhibitor manual here link in exhibitors
Then Validate exhibitor manual document in exhibitors
When To navigate back
When To click Download the list of restricted imports for egypt link in exhibitors
Then Validate list of restricted imports for egypt document in exhibitors
When To navigate back
When To click Download the list HERE link in exhibitors
Then Validate the list of exhibiting countries document in exhibitors
When To navigate back
And  To click FIND OUT MORE link in exhibitor stand award
Then Validate Exhibitor Stand Award PDF
When To click download the brochure in exhibitors
Then Validate the brochure document in exhibitors
When To navigate back
Then Validate the Team call Number
When To click Explore IATF virtual link in exhibitors
Then Validate Explore IATF virtual page in exhibitors
When To navigate back
Then To click VIEW EXHIBITOR STAND PACKAGES two link in exhibitors
Then Validate VIEW EXHIBITOR STAND PACKAGES two page in exhibitors
When To navigate back



@new
Scenario: To validate the exibitorsList page

Given To open the IATF application
When To click the Exhibitors button
When To click the exibitors Listing link
Then Validate exibitors Listing search page
When To Enter country name in search box
When To click search button
When To Click View this exhibitor button of required exhibitor
Then Validate the exhibitor details
When To navigate back
When To click Reset button
And  To click advance search check box
Then Validate the countries dropdown
When To select exhibitors countries from dropdown
Then Validate the business dropdown
When To select exhibitors business from dropdown
Then Validate the sector dropdown
When To select exhibitors sector from dropdown
And To Click View this exhibitor button of required exhibitor
Then Validate the exhibitor details

