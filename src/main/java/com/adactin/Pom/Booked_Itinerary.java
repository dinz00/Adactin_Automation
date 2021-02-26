package com.adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	public WebDriver Driver;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement Booked;

	@FindBy(id = "logout")
	private WebElement logout;

	public Booked_Itinerary(WebDriver driver2) {
		this.Driver = driver2;
		PageFactory.initElements(Driver, this);
	}

	public WebElement getBooked() {
		return Booked;
	}

	public WebElement getLogout() {
		return logout;
	}

}
