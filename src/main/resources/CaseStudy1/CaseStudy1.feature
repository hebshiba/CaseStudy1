Feature: Register Functionality

Scenario: New user registering by using valid details
When user opens chrome user and opens apllication
Then user clicks sigup button
When user enter uname as "manoshine" in uname field
When user enter fname as "manoshinee" in fname field And lname as "N" 
When user provide password as "manoshinee" And confirm password as "manoshinee"
Then user selects Female
When user give mail id as "manoshinee@gmail.com" in field
When user give mobile number as "1234569878"
Then user provide DOB as "01/02/1996"
When user enters Address as "Ekattuthangal Chennai"
Then user choose question as which birth place
When user enters as "Chennai"
Then user click register
When user verify the register

  