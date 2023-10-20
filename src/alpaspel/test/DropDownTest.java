package src.alpaspel.test;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;

import src.alphaspel.pagebase.PageBase;
import src.alphaspel.pages.DropDownPage;
import src.alphaspel.testbase.TestBase;

public class DropDownTest extends TestBase {

	/*Test 2 -> Objective: to verify the drop down section's selection function and
	 the search button's responsiveness */
	@Test
	void dropDownCheckingTest() {
		DropDownPage dropDownPage = new DropDownPage(page);

		PageBase pageBase = new PageBase(page);
		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		dropDownPage.dropDownSearch();

		assertThat(dropDownPage.searchButton).isEnabled();

	}

}
