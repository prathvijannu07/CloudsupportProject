package TestCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utils.BaseTest;
import Utils.PropertyHandler;

/**
 * Unit test for simple App.
 */
public class Login {
	public WebDriver driver;

	@Test
	public static void Login_TC(WebDriver driver, String username, String password) throws IOException {
		String usernameElement = PropertyHandler.getInstance().getValue("UsernameElementPath");
		String passwordElement = PropertyHandler.getInstance().getValue("PasswordElementPath");
		String loginElement = PropertyHandler.getInstance().getValue("LoginPath");

		driver.findElement(By.xpath(usernameElement)).sendKeys(username);
		driver.findElement(By.xpath(passwordElement)).sendKeys(password);
		driver.findElement(By.xpath(loginElement)).click();
	}
	 @After
	    public void tearDown() {
	        driver.close();
	    }
	
}
