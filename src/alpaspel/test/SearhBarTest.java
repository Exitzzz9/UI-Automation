package src.alpaspel.test;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;

import src.alphaspel.pages.SearchBarPage;
import src.alphaspel.testbase.TestBase;
import src.alphaspel.pagebase.PageBase;


public class SearhBarTest extends TestBase {
	// Test 9 -> Objective: Verify the search bar function show's the intended products.
	 
	@Test
	void testSearchBarInput() {
		SearchBarPage searchBarPage = new SearchBarPage(page);
		
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		searchBarPage.searchInput("Ticket To Ride");
		
		assertThat(searchBarPage.searchButton).isEnabled();
	}
}
