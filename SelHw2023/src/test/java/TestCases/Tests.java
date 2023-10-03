package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.checkoutInfoPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import Pages.productsPage;

public class Tests {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test
	public void shopping() {
		loginPage lp = new loginPage(driver);
		productsPage pp = new productsPage(driver);
		productDetailsPage pdp = new productDetailsPage(driver);
		overviewPage op = new overviewPage(driver);
		cartPage cp = new cartPage(driver);
		completePage compPage = new completePage(driver);
		//infoPage ip = new infoPage(driver);
		checkoutInfoPage cip = new checkoutInfoPage(driver);
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.clickLoginBtn();
		pp.clickProduct();
		pdp.clickaddToCart();
		pdp.clickCartLink();
		String item = pdp.getHeader();
		System.out.println(item);	
		String price = pp.getPrice();
		System.out.println(price);
		cp.clickCheckout();
		cip.enterdetails("sam", "Gonzalo", "YH785");
		cip.clickChkoutCont();
		op.clickFinish();
		String s = compPage.getHeader();
		System.out.println(s);
		compPage.clickBackToHome();
		
	}
		
	@AfterMethod
	public void done() {
		driver.quit();
	}
	

}
