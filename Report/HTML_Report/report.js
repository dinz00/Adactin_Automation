$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel In Adactin Application",
  "description": "",
  "id": "hotel-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-in-adactin-application;user-login-in-the-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-in-adactin-application;user-login-in-the-login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-in-adactin-application;user-login-in-the-login-page;;1"
    },
    {
      "cells": [
        "cheery",
        "1234"
      ],
      "line": 12,
      "id": "hotel-in-adactin-application;user-login-in-the-login-page;;2"
    },
    {
      "cells": [
        "GlennMaggie",
        "Chennai@1993"
      ],
      "line": 13,
      "id": "hotel-in-adactin-application;user-login-in-the-login-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-in-adactin-application;user-login-in-the-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"cheery\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"1234\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 2088700300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cheery",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 151614400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 67749400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage()"
});
formatter.result({
  "duration": 349236100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-in-adactin-application;user-login-in-the-login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"GlennMaggie\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Chennai@1993\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 276074100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GlennMaggie",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 77577500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chennai@1993",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 80929500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage()"
});
formatter.result({
  "duration": 667902500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "user Select The Hotel In The Search HotelPage",
  "description": "",
  "id": "hotel-in-adactin-application;user-select-the-hotel-in-the-search-hotelpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "user Select The Hotel Location",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotels",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Check out Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Adults Per Rooom",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click On The Search Button And It Navigates To The SelectHotel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_Location()"
});
formatter.result({
  "duration": 167149800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotels()"
});
formatter.result({
  "duration": 127413100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 142493100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 141401300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_In_Date()"
});
formatter.result({
  "duration": 70551900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Check_out_Date()"
});
formatter.result({
  "duration": 58209800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Adults_Per_Rooom()"
});
formatter.result({
  "duration": 138353400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Children_Per_Room()"
});
formatter.result({
  "duration": 135885100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Search_Button_And_It_Navigates_To_The_SelectHotel()"
});
formatter.result({
  "duration": 495795800,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "user Select The Hotel In The  Select Hotel Page",
  "description": "",
  "id": "hotel-in-adactin-application;user-select-the-hotel-in-the--select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user Select The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user Click On The Continue Button And It Navigates To The Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Radio_Button()"
});
formatter.result({
  "duration": 54976200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel()"
});
formatter.result({
  "duration": 534189300,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "user Select The Hotel In The  Book A Hotel",
  "description": "",
  "id": "hotel-in-adactin-application;user-select-the-hotel-in-the--book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user Select The First Name",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select The Lasst Name",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The Credit Card No",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select The Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click On The Book Now Button And It Navigates To The Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_First_Name()"
});
formatter.result({
  "duration": 79437100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Lasst_Name()"
});
formatter.result({
  "duration": 75966300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Billing_Address()"
});
formatter.result({
  "duration": 92743300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Credit_Card_No()"
});
formatter.result({
  "duration": 86188800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 135808600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Expiry_Date()"
});
formatter.result({
  "duration": 244882300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_CVV_Number()"
});
formatter.result({
  "duration": 65987500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation()"
});
formatter.result({
  "duration": 5071178400,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "user Select The Hotel In The Booking Confirmation",
  "description": "",
  "id": "hotel-in-adactin-application;user-select-the-hotel-in-the-booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "user Click On the My Itnerary And It Navigates To The Booked Itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_On_the_My_Itnerary_And_It_Navigates_To_The_Booked_Itinerary()"
});
formatter.result({
  "duration": 1134550500,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "User Confirms the Booked Itinerary ID",
  "description": "",
  "id": "hotel-in-adactin-application;user-confirms-the-booked-itinerary-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "User click On The Logout Button And Successfully Logged Out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_On_The_Logout_Button_And_Successfully_Logged_Out()"
});
formatter.result({
  "duration": 392208300,
  "status": "passed"
});
});