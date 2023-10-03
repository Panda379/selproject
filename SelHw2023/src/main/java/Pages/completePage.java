package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage {
	
	WebDriver driver;
	public completePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2")
	private WebElement header;

	@FindBy(id="back-to-products")
	private WebElement backToHome;
		
	
	public String getHeader() {
		return header.getText();
	}
	
	public void clickBackToHome() {
		backToHome.click();
	}	
	
}
