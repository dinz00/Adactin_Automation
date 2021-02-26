package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.Pom.Book_Hotel;
import com.adactin.Pom.Booked_Itinerary;
import com.adactin.Pom.Booking_Confirmation;
import com.adactin.Pom.Login_page;
import com.adactin.Pom.Search_Hotel;
import com.adactin.Pom.Select_Hotel;

public class PageObjectManager {
	public static WebDriver driver;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_page get_login() {
		Login_page login = new Login_page(driver);
		return login;

	}

	public Search_Hotel Serach_hotel() {
		Search_Hotel search = new Search_Hotel(driver);
		return search;
	}

	public Select_Hotel get_SelectHotel() {
		Select_Hotel select = new Select_Hotel(driver);
		return select;
	}

	public Book_Hotel get_BookHotel() {
		Book_Hotel book = new Book_Hotel(driver);
		return book;
	}

	public Booking_Confirmation get_BookingConfirm() {
		Booking_Confirmation confirm = new Booking_Confirmation(driver);
		return confirm;
	}

	public Booked_Itinerary get_BookingItinerary() {
		Booked_Itinerary itineary = new Booked_Itinerary(driver);
		return itineary;
	}
}
