package src.alpaspel.test;

import org.junit.jupiter.api.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;

import src.alphaspel.pagebase.PageBase;
import src.alphaspel.pages.DeleteIconPage;
import src.alphaspel.testbase.TestBase;

public class DeleteIconTest extends TestBase {
	// Test 1 -> Objective: To verify the selected products can be deleted.
	@Test
	void testDeleteIcon() {
		DeleteIconPage deleteIconPage = new DeleteIconPage(page);
		PageBase pageBase = new PageBase(page);
		pageBase.openPage("https://alphaspel.se/");
		pageBase.acceptCookies();
		deleteIconPage.testingDeleteIcon();
		assertThat(deleteIconPage.deleteButton).isHidden();
		
	}

}
