package src.alphaspel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import src.alphaspel.pagebase.PageBase;

public class LogInPage extends PageBase {
	
	Page page;
	
	Locator logInLink;
	Locator emailAddress;
	Locator password;
	Locator logInButton;
	public Locator errorMessage;
	
	public LogInPage(Page page) {
		this.page=page;
		this.logInLink = page.getByText("Logga In");
		this.emailAddress = page.getByRole(AriaRole.TEXTBOX,
				new Page.GetByRoleOptions().setName("Email"));
		this.password = page.getByRole(AriaRole.TEXTBOX,
				new Page.GetByRoleOptions().setName("Lösenord"));
		this.logInButton = page.getByRole(AriaRole.BUTTON, new
				  Page.GetByRoleOptions().setName("Logga In"));
		this.errorMessage = page
				  .getByText("Ange ett korrekt Email och lösenord. Observera att båda fälten är skiftlägeskänsliga."
						  );
	}
	public void openLogInPage() {
		String loginUrl = "https://alphaspel.se/";
		page.navigate(loginUrl);
	}
	
	public void logIn(String emailInput, String passwordInput ) {
		logInLink.click();
		emailAddress.fill(emailInput);
		password.fill(passwordInput);
		logInButton.click();
	}
	

}
