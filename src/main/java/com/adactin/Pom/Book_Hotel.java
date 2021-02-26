package com.adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cc_num;

	@FindBy(id = "cc_type")
	private WebElement cc_type;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_yr;

	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;

	@FindBy(id = "book_now")
	private WebElement book_now;

	public WebDriver driver;

	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

		public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp() {
		return cc_exp;
	}

	public WebElement getCc_exp_yr() {
		return cc_exp_yr;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

}
