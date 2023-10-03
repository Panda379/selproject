package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutInfoPage {
	
	WebDriver driver;
	public checkoutInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="first-name")
	private WebElement fName;
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="postalCode")
	private WebElement zipCode;
	
	@FindBy(name="continue")
	private WebElement chkCont;
	
	public void enterdetails(String firstName,String lastName,String zip) {
	fName.sendKeys(firstName);
	lName.sendKeys(lastName);
	zipCode.sendKeys(zip);
	
	}

	public void clickChkoutCont() {
		chkCont.click();
	}
	
	
}
