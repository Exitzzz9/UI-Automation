package src.alphaspel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SearchBarPage {
	
	
	private final Page page;
	
	Locator allCategories;
	Locator searchBar;
	public Locator searchButton;
	
	public SearchBarPage(Page page) {
		this.page = page;
		this.allCategories = page.getByText("Alla Kategorier");
		this.searchBar = page.getByPlaceholder("Sök");
		this.searchButton = page.locator("#search-button");
	}
	
	public void searchInput (String textInput) {
		searchBar.fill(textInput); 
		searchButton.click();
	}
	
	
	

}
