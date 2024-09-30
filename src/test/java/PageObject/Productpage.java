package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage  {

	WebDriver driver;

	public Productpage(WebDriver driver) {
		this.driver = driver;
	}

	By product_Heading = By.xpath("//span[contains(text(),'Products')]");
	By Addtocart_button_1 = By.id("add-to-cart-sauce-labs-backpack");
	By Addtocart_button_2 = By.id("add-to-cart-sauce-labs-bike-light");
	By shopingCart_Count = By.xpath("//span[@class='shopping_cart_badge']");

	public String GetProductElement() {
		System.out.println(product_Heading);
		return driver.findElement(product_Heading).getText();

	}

	public void click_button_1() {
		driver.findElement(Addtocart_button_1).click();

	}

	public void click_button_2() {
		driver.findElement(Addtocart_button_2).click();

	}

	public String getShoppingCart_count() {
		return driver.findElement(shopingCart_Count).getText();

	}
}