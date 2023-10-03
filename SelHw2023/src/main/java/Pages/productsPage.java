package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {
	
	WebDriver driver;
	public productsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="item_0_title_link")
	private WebElement bikeLight;
	
	@FindBy(xpath="//*[text()='9.99']")
	private WebElement bikeLightPrice;
	
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	private WebElement bikeLightCartAdd;		
	
	public void clickProduct() {
		bikeLight.click();
	}
	
	public void clickAddToCart() {
		bikeLightCartAdd.click();
	}

	public String getPrice() {
		return bikeLightPrice.getText();
	}
	
	
}
