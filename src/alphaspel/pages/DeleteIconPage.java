package src.alphaspel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class DeleteIconPage {

	private final Page page;

	Locator boardGameProduct;
	Locator product;
	Locator buyButton;
	public Locator deleteButton;

	public DeleteIconPage(Page page) {
		this.page = page;
		this.boardGameProduct = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Brädspel"));
		this.product = page.locator("[href*='/checkout/add/138084']");
		this.buyButton = page.locator("#cart-and-number");
		this.deleteButton = page.locator("[class='delete fa-lg checkout-remove']");
	}

	public void testingDeleteIcon() {
		boardGameProduct.click();
		product.click();
		buyButton.click();
		deleteButton.click();
	}

}
