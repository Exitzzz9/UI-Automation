package src.alpaspel.test;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;


import src.alphaspel.pagebase.PageBase;
import src.alphaspel.pages.HeaderPage;
import src.alphaspel.testbase.TestBase;

public class HeaderPageTest extends TestBase {
	
	// Test 3
	
	@Test
	void testHoverHeader() {
		HeaderPage headerPage = new HeaderPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		headerPage.testingHovering();
		
		assertThat(headerPage.diceProduct).isFocused();
		
	}

}
