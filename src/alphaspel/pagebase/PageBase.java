package src.alphaspel.pagebase;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class PageBase {
	Page page;
	//Below is a constructor which needs to have the exact same name as the class. We do this to initialize page in openPage()
	
	public PageBase() {
		
	}
	public PageBase(Page page) {
		this.page = page;
		}
	
	public void openPage(String url) {
		page.navigate(url);
	}
	public void acceptCookies() {
		
		Locator cookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla"));
		if (cookies.isVisible()) {
			cookies.click();
		}
	}

}
