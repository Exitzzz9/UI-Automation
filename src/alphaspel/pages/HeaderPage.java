package src.alphaspel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.MouseButton;

public class HeaderPage {
	
	private final Page page;
	
	public Locator diceProduct;
	
public HeaderPage(Page page) {
	this.page = page;
	this.diceProduct = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Tärningar"));
}

public void testingHovering() {
	diceProduct.hover();
	diceProduct.click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
}
	
}
