package src.alpaspel.test;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import src.alphaspel.pages.ProductPage;
import src.alphaspel.testbase.TestBase;
import src.alphaspel.pagebase.PageBase;

public class ProductPageTest extends TestBase {
	/*
	 * Contains three tests. I wanted to try adding several tests in one file by
	 * avoiding the repetition of similar locators. However the repetition was
	 * unavoidable in test scripts.
	 * 
	 * Test 6 -> Objective: To verify the sorting function and buy button by
	 * stressing the button
	*/ 
	 @Test
	void sortAndStressTest() {
		ProductPage productPage = new ProductPage(page);

		PageBase pageBase = new PageBase(page);
		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		productPage.sortingAndStressButton();

		assertThat(productPage.productNumber).hasValue("10");

	}
	// Test 7 -> Objective: Testing the product quantity's input field's
	// responsiveness.

	@Test
	void quantityInputFieldTest() {
		ProductPage productPage = new ProductPage(page);
		PageBase pageBase = new PageBase(page);

		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		productPage.quantityInputCheck("30");

		assertThat(productPage.checkOut).isEnabled();

	}
	// Test 8 -> Objective: Testing the button 'Boka'.

	 
	@Test
	
	void reserveButtonTest() {
		ProductPage productPage = new ProductPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		productPage.testReserveButton("5");

		assertThat(productPage.reserveButton).isEnabled();

	}
}
