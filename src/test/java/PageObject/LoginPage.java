package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");

	public void EnterUserName(String Username) {
		driver.findElement(username).sendKeys(Username);
	}

	public void EnterPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();

	}

	public void LoginSauceDemo(String Username, String Password) {
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(loginButton).click();

	}

}
