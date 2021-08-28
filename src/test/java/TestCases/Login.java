package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.BaseTestClass;
import Utils.ExcelUtils;
import Utils.PropertyHandler;

/**
 * Unit test for simple App.
 */
public class Login extends BaseTestClass{

	static WebDriver driver;
	static String AppUrl = "https://mjan.container.webmethodscloud.com/integration/";
	static Object[][] arrObj;
	static String SheetName = "Users";

	/*@BeforeMethod
	public static void InitDriver() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\driver\\chromedriver_91.0.4472.19.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(AppUrl);
		// System.out.println("BeforeMethod");

	}*/

	@Test(dataProvider = "dataprovider")
	public void Login_TC(String sUserName, String sPassword) throws Exception {

		// System.out.println(sUserName);
		// System.out.println(sPassword);
		String usernameElement = PropertyHandler.getInstance().getValue("UsernameElementPath");
		String passwordElement = PropertyHandler.getInstance().getValue("PasswordElementPath");
		String loginElement = PropertyHandler.getInstance().getValue("LoginPath");
		// WebElement ErrorMessage =
		// driver.findElement(By.xpath(PropertyHandler.getInstance().getValue("FaildMessage")));
		// String FaildMessage=ErrorMessage.getText();
		// ExcelUtils.write(SheetName,ErrorMessage);
		// driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		WebElement element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(usernameElement)));
		element.sendKeys(sUserName);
		// driver.findElement(By.xpath(usernameElement)).sendKeys(sUserName);
		driver.findElement(By.xpath(passwordElement)).sendKeys(sPassword);
		driver.findElement(By.xpath(loginElement)).click();

		// Thread.sleep(2000);

		// driver.findElement(By.xpath(SolutionElement)).click();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// driver.findElement(By.xpath(createNewSolution)).isDisplayed();
		// driver.findElement(By.xpath(createNewSolution)).click();
		// driver.findElement(By.xpath(createNewSolution)).click();

	}

	@DataProvider(name = "dataprovider")
	public Object[][] Authentication() throws Exception {
		System.out.println(SheetName);
		Object[][] data = ExcelUtils.ProvideData(SheetName);

		return data;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
