package TestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.Productpage;
import Utils.TestBase;

public class Login extends TestBase {
	@Test
	public void testcase_001() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUserName("problem_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
        Thread.sleep(2000);
	}

	@Test
	public void testcase_002() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.EnterUserName("locked_out_user");
		loginPage.EnterPassword("secret_sauce");
		loginPage.clickLoginButton();
		Thread.sleep(2000);

	}
}