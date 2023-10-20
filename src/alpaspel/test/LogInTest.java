package src.alpaspel.test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.jupiter.api.Test;

import src.alphaspel.pagebase.PageBase;
import src.alphaspel.pages.LogInPage;
import src.alphaspel.testbase.TestBase;

public class LogInTest extends TestBase {
	// Test 5 -> Objective: To verify the login (Negative test)
	@Test
	void testLogInMessage() {
		LogInPage logInPage = new LogInPage(page);

		logInPage.openLogInPage();
		PageBase pageBase = new PageBase(page);

		pageBase.acceptCookies();

		logInPage.logIn("adminTest", "adminTest");

		assertThat(logInPage.errorMessage)
				.containsText("Ange ett korrekt Email och lösenord. Observera att båda fälten är skiftlägeskänsliga.");

	}

}
