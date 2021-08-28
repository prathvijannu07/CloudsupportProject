package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleObjectBrowserClass {

	// instance of singleton class
	private static SingleObjectBrowserClass instanceOfSingletonBrowserClass = null;

	private WebDriver driver;

	// Constructor
	public SingleObjectBrowserClass() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\driver\\chromedriver_91.0.4472.19.exe");
		driver = new ChromeDriver();
	}

	// TO create instance of class
	public static SingleObjectBrowserClass getInstanceOfSingletonBrowserClass() {
		if (instanceOfSingletonBrowserClass == null) {
			instanceOfSingletonBrowserClass = new SingleObjectBrowserClass();
		}
		return instanceOfSingletonBrowserClass;
	}

	// To get driver
	public WebDriver getDriver() {
		return driver;
	}

}
