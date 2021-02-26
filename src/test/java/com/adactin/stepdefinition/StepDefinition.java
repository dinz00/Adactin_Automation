package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactin.Base.Base_Class1;
import com.adactin.Pom.Book_Hotel;
import com.adactin.Pom.Booked_Itinerary;
import com.adactin.Pom.Booking_Confirmation;
import com.adactin.Pom.Login_page;
import com.adactin.Pom.Search_Hotel;
import com.adactin.Pom.Select_Hotel;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class1 {
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver) ;

	//Login_page login = new Login_page(driver);
	//Search_Hotel Search = new Search_Hotel(driver);
	//Select_Hotel select = new Select_Hotel(driver);
	//Book_Hotel hotel = new Book_Hotel(driver);
	//Booking_Confirmation confirm = new Booking_Confirmation(driver);
	//Booked_Itinerary itinerary = new Booked_Itinerary(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = FileReaderManager.getinstance().getInstanceCR().geturl();
		geturl(url);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	inputvalue(pom.get_login().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	inputvalue(pom.get_login().getPassword(), password);
	}

	@Then("^user Click On The Login Button And It Navigates To The SearchHotelPage$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage() throws Throwable {
		clickontoElement(pom.get_login().getLogin());
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		dropdown(pom.Serach_hotel().getLocation(),"Value", "Sydney");
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		dropdown(pom.Serach_hotel().getHotels(), "Value", "Hotel Sunshine");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		dropdown(pom.Serach_hotel().getRoom_type(), "Value", "Super Deluxe");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		dropdown(pom.Serach_hotel().getRoom_nos(), "Value", "4");
	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		inputvalue(pom.Serach_hotel().getDatepick_in(), "18/02/2022");
	}

	@When("^user Select The Check out Date$")
	public void user_Select_The_Check_out_Date() throws Throwable {
		inputvalue(pom.Serach_hotel().getDatepick_out(), "21/02/2022");
	}

	@When("^user Select The Adults Per Rooom$")
	public void user_Select_The_Adults_Per_Rooom() throws Throwable {
		dropdown(pom.Serach_hotel().getAdult_room(), "Value", "4");
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		dropdown(pom.Serach_hotel().getChild_room(), "Value", "4");
	}

	@Then("^user Click On The Search Button And It Navigates To The SelectHotel$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_SelectHotel() throws Throwable {
		clickontoElement(pom.Serach_hotel().getSubmit());
	}

	@When("^user Select The Radio Button$")
	public void user_Select_The_Radio_Button() throws Throwable {
clickontoElement(pom.get_SelectHotel().getRadiobutton_0());	}

	@Then("^user Click On The Continue Button And It Navigates To The Book A Hotel$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		clickontoElement(pom.get_SelectHotel().getContinue());
	}

	@When("^user Select The First Name$")
	public void user_Select_The_First_Name() throws Throwable {
		inputvalue(pom.get_BookHotel().getFirst_name(), "HONEY");
	}

	@When("^user Select The Lasst Name$")
	public void user_Select_The_Lasst_Name() throws Throwable {
		inputvalue(pom.get_BookHotel().getLast_name(), "MOON");
	}

	@When("^user Select The Billing Address$")
	public void user_Select_The_Billing_Address() throws Throwable {
		inputvalue(pom.get_BookHotel().getAddress(), "198 Washington street CA 5678");
	}

	@When("^user Select The Credit Card No$")
	public void user_Select_The_Credit_Card_No() throws Throwable {
		inputvalue(pom.get_BookHotel().getCc_num(), "1234567890987654");
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		dropdown(pom.get_BookHotel().getCc_type(), "Value", "VISA");
	}

	@When("^user Select The Expiry Date$")
	public void user_Select_The_Expiry_Date() throws Throwable {
		dropdown(pom.get_BookHotel().getCc_exp(), "Value", "4");
		dropdown(pom.get_BookHotel().getCc_exp_yr(), "Value", "2014");
	}

	@When("^user Select The CVV Number$")
	public void user_Select_The_CVV_Number() throws Throwable {
		inputvalue(pom.get_BookHotel().getCc_cvv(), "234");
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Booking Confirmation$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
		clickontoElement(pom.get_BookHotel().getBook_now());
		Thread.sleep(5000);
	}

	@Then("^user Click On the My Itnerary And It Navigates To The Booked Itinerary$")
	public void user_Click_On_the_My_Itnerary_And_It_Navigates_To_The_Booked_Itinerary() throws Throwable {
clickontoElement(pom.get_BookingConfirm().getMy_itine());
	}

	@Then("^User click On The Logout Button And Successfully Logged Out$")
	public void user_click_On_The_Logout_Button_And_Successfully_Logged_Out() throws Throwable {
		clickontoElement(pom.get_BookingItinerary().getBooked());
		clickontoElement(pom.get_BookingItinerary().getLogout());
	}

}
