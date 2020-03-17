package com.manager;

import com.pojo.BookHotelPojo;
import com.pojo.BookingConfirmPojo;
import com.pojo.LoginPagePojo;
import com.pojo.SearchHotelpojo;
import com.pojo.SelectHotelPojo;

public class PageObjectManager {

	private LoginPagePojo loginPagePojo;
	private SearchHotelpojo searchHotelpojo;
	private SelectHotelPojo selectHotelPojo;
	private BookHotelPojo bookHotelPojo;
	private BookingConfirmPojo bookingConfirmPojo;

	public LoginPagePojo getLoginPagePojo() {
		return (loginPagePojo == null) ? loginPagePojo = new LoginPagePojo() : loginPagePojo;
	}

	public SearchHotelpojo getSearchHotelpojo() {
		return (searchHotelpojo == null) ? searchHotelpojo = new SearchHotelpojo() : searchHotelpojo;
	}

	public SelectHotelPojo getSelectHotelPojo() {
		return (selectHotelPojo == null) ? selectHotelPojo = new SelectHotelPojo() : selectHotelPojo;
	}

	public BookHotelPojo getBookHotelPojo() {
		return (bookHotelPojo == null) ? bookHotelPojo = new BookHotelPojo() : bookHotelPojo;
	}

	public BookingConfirmPojo getBookingConfirmPojo() {
		return (bookingConfirmPojo == null) ? bookingConfirmPojo = new BookingConfirmPojo() : bookingConfirmPojo;
	}

}
