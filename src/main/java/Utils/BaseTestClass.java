package Utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import TestCases.Login;
//import TestCases.Solutions;

public class BaseTestClass {

	public static WebDriver driver;
	static String AppUrl = "https://mjan.container.webmethodscloud.com/integration/";
	String FilePath = "";
	static String SheetName = "Credentials";

	@Test(dataProvider = "InitLogin")
	public static void InitDriver(String sUserName, String sPassword) throws IOException {

		String usernameElement = PropertyHandler.getInstance().getValue("UsernameElementPath");
		String passwordElement = PropertyHandler.getInstance().getValue("PasswordElementPath");
		String loginElement = PropertyHandler.getInstance().getValue("LoginPath");
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\driver\\chromedriver_91.0.4472.19.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(AppUrl);
		WebElement element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(usernameElement)));
		element.sendKeys(sUserName);
		driver.findElement(By.xpath(passwordElement)).sendKeys(sPassword);
		driver.findElement(By.xpath(loginElement)).click();

	}

	@DataProvider(name = "InitLogin")
	public Object[][] Authentication() throws Exception {
		// System.out.println(SheetName);
		Object[][] data = ExcelUtils.ProvideData(SheetName);

		return data;
	}

}
