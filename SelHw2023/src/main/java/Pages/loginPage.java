package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 1. Page elements - locators
	// 2. Page methods actions or element action - method class
	// 3. Page objective - Page Factory - Constructors - interlink bridge
	
	@FindBy(id="user-name") 
	private WebElement Unmae;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	public void enterUsername(String username) {
		Unmae.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
		
	}
	
}
