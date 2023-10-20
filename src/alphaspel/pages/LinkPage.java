package src.alphaspel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LinkPage {
	
	private final Page page;
	
	Locator redirectionLink;
	
	
	public LinkPage(Page page) {
		this.page = page;
		this.redirectionLink = page.getByRole(AriaRole.LINK,
				new Page.GetByRoleOptions().setName("Boka bord på Alphabar.se"));
	}
	
	public void testEventLink() {
		redirectionLink.click();

		
	}
	

}
