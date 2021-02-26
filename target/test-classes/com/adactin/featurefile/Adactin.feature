Feature: Hotel In Adactin Application 

Scenario Outline: user Login In The Login Page 

Given user Launch The Application 
When user Enter The "<Username>" In Username Field 
And user Enter The "<Password>" In Password Field 
Then user Click On The Login Button And It Navigates To The SearchHotelPage 

Examples:
|Username|Password|
|cheery|1234|
|GlennMaggie|Chennai@1993|
	
 
Scenario: user Select The Hotel In The Search HotelPage 
When user Select The Hotel Location 
And user Select The Hotels 
And user Select The Room Type 
And user Select The Number Of Rooms 
And user Select The Check In Date 
And user Select The Check out Date 
And user Select The Adults Per Rooom 
And user Select The Children Per Room 
Then user Click On The Search Button And It Navigates To The SelectHotel 
	
Scenario: user Select The Hotel In The  Select Hotel Page 
	When user Select The Radio Button 
	Then user Click On The Continue Button And It Navigates To The Book A Hotel 
	
Scenario: user Select The Hotel In The  Book A Hotel 
	And user Select The First Name 
	And user Select The Lasst Name 
	And user Select The Billing Address 
	And user Select The Credit Card No 
	And user Select The Credit Card Type 
	And user Select The Expiry Date 
	And user Select The CVV Number 
	Then user Click On The Book Now Button And It Navigates To The Booking Confirmation 
	
Scenario: user Select The Hotel In The Booking Confirmation 
	Then user Click On the My Itnerary And It Navigates To The Booked Itinerary 
	
Scenario: User Confirms the Booked Itinerary ID 
	Then User click On The Logout Button And Successfully Logged Out 
	
