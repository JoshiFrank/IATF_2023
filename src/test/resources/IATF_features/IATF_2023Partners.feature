@new
Feature: To Validate The IATF partners Functionality

Scenario: To validate the IATF partners page

Given To open the IATF application
When To click IATF partners button
When To click IATF partners link
Then To validate the IATF partners page
When To click enquire today link
Then To validate enquire today page
#When To navigate back
#When To click media partner link 
#Then To validate the media partner page
#When To navigate back
#When To click official partner link
#Then To validate official partner page
#When To navigate back

Scenario: To validate the official partners page

Given To open the IATF application
When To click IATF partners button
When To click official partners link
Then To validate official partners page
When To click visit partner button from official partners page
Then To validate visit partner page from official partners page
When To navigate back

Scenario: To validate the event partners page

Given To open the IATF application
When To click IATF partners button
When To click event partners link
Then To validate event partners page
When To click visit partner button from event partners page
Then To validate visit partner page from event partners page
#When To navigate back

Scenario: To validate the association partners page

Given To open the IATF application
When To click IATF partners button
When To click association partners link
Then To validate association partners page
When To click visit partner button from association partners page
Then To validate visit partner page from association partners page
#When To navigate back


Scenario: To validate the media partners page

Given To open the IATF application
When To click IATF partners button
When To click media partners link
Then To validate media partners page
When To click visit partner button from media partners page
Then To validate visit partner page from media partners page
When To navigate back