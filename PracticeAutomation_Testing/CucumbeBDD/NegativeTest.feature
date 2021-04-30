Feature: User able to login with valid username & password

Description: "User login zoopla website & search the property &"
        "select  the  property as well as verify the property price." 
        
 @smokeTest
 Scenario Outline: User login with valid username,password & verify the page title
 Given User can open any browser
 And User able to enter"https://www.zoopla.co.uk/" url
 When User able to click on the signin button
 And User can enter the username"<userName>"
 And User can enter the pwd "<password>" 
 And User click on the login button
 Then User able to login successfully login & verify the homepage title
 
 Examples:
  |          userName        |    password       | 
  |alammohammed79@gmail.com  |SAYEDawan2008@     | 
  |alammohammed79@gmail      |SAYEDawan2008@     | 
  |alammohammed79@gmail.com  |SAYEDawan2008yy    | 
  |1223422424434343434542552 |SAYEDawan2008@     | 
  |alammohammed79@gmail.com  |12233232442424424  | 
       
        
   