package src.alpaspel.test;

import org.junit.jupiter.api.Test;
import src.alphaspel.pagebase.PageBase;
import src.alphaspel.pages.LinkPage;
import src.alphaspel.testbase.TestBase;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LinkTest extends TestBase {

	// Test 4 -> Objective: To verify the link is redirecting to the correct URL.
	// Came up with two assertion suggestions.

	@Test
	void eventLink() {

		LinkPage linkPage = new LinkPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		linkPage.testEventLink();
		assertThat(page.url(), "https://alphabar.bokamera.se/");

	}

	private void assertThat(String url, String string) {
		// TODO Auto-generated method stub

	}

	// assertThat(page).hasURL("https://alphabar.bokamera.se/");

}
