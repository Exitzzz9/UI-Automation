package src.alphaspel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator.ClickOptions;
import com.microsoft.playwright.options.AriaRole;

public class ProductPage {
	
	
	private final Page page;
	
	Locator productBoardGame;
	Locator sortProduct;
	Locator buyButton;
	Locator cartCollection;
	public Locator productNumber;
	Locator newsSection;
	Locator productRolePlay;
	Locator gameBuyButton;
	public Locator checkOut;
	Locator productFigures;
	Locator figureImage;
	public Locator reserveButton;
	Locator productQuantityInput;
	
	public ProductPage(Page page) {
		this.page = page;
		this.productBoardGame = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Brädspel")); 
		this.sortProduct = page.locator("#product-sort-select");
		this.buyButton = page.locator("[href*='/checkout/add/138084']");
		this.cartCollection = page.locator("#cart-and-number");
		this.productNumber = page.locator("#id_form-0-quantity");
		this.newsSection = page.locator("[href*='/462-rollspel/news/']");
		this.productRolePlay = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Rollspel"));
		this.gameBuyButton = page.locator("[href*='/checkout/add/205998']");
		this.checkOut = page.locator("#checkout");
		this.productFigures = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Samlarfigurspel"));
		this.figureImage = page.getByAltText("WizKids Critical Role");
		this.reserveButton = page.getByText("Boka");
		this.productQuantityInput = page.locator("#cart_quantity");

		
	}
	
	public void sortingAndStressButton () {
		productBoardGame.click();
		sortProduct.click();
		sortProduct.selectOption("/491-bradspel/?order_by=total_stock&ordering=desc");
		  ClickOptions clickOptions = new ClickOptions();
		  clickOptions.setDelay(0.5); 
		  for (int i = 0; i < 10; i++) {
		  buyButton.click(clickOptions);
		  }
		  cartCollection.click();
	}
	
	public void quantityInputCheck(String productQuantity) {
		productRolePlay.click();
		newsSection.click();
		gameBuyButton.click();
		cartCollection.click();
		productNumber.click();
		checkOut.press("Backspace");
		checkOut.type(productQuantity);
		
	}
	
	public void testReserveButton(String productNum) {

		productFigures.click();
		figureImage.click();
		reserveButton.first().click();
		productQuantityInput.fill(productNum);
		
	}
	
	
}





