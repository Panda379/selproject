package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage {
	
	WebDriver driver;
	public productDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='Sauce Labs Bike Light']")
	private WebElement header;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement cartAdd;
	
	@FindBy(className="inventory_details_price")
	private WebElement getprice;
	
	@FindBy(className="shopping_cart_link")
	private WebElement cartLink;
	
	public void clickaddToCart() {
		cartAdd.click();
	}	
		
	public String getHeader() {
		return header.getText();
	}
	
	public void clickCartLink() {
		cartLink.click();
	}
	
	
}
