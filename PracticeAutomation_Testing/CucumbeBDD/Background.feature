 @sanity
 Feature: User able to login with valid username & password.

Description: "User login zoopla website & search the property &"
        "select  the  property as well as verify the property price." 
                                             

Background: 
        Given User can open any browser
        And User able to enter "https://www.zoopla.co.uk/" url 
        When User able to click on the login button
        And  User enter the userName "alammohammed79@gmail.com" and password "SAYEDawan2008@"
        And User click on the signing button 
        Then User able to verify successfully login and verify the homepage title
   @sanity     
        Scenario: User can search the property and verify the price
       Given User able to enter the location as"New York, Lincolnshire" in text box
       When User able to print  all property value/price in consule and click on thard property 
	Then Verify the price of the property 
	

        
        

	