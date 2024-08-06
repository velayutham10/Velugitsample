package org.manager;

import org.page.LoginPage;
import org.page.SearchHotelPage;

public class PageManager {

	private LoginPage loginPage;

	private SearchHotelPage searchHotelPage;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}
	
	

}
