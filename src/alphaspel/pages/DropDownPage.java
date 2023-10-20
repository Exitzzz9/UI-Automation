package src.alphaspel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DropDownPage {

	private final Page page;
	
	Locator dropDown;
	public Locator searchButton;
	
	public DropDownPage(Page page) {
		this.page = page;
		this.dropDown = page.locator("#search-dropdown");
		this.searchButton = page.locator("[data-action='/947-kortspel/search/']");
	}
	
	public void dropDownSearch () {
		dropDown.click();
		searchButton.click();
	}
	
	
}

 

 