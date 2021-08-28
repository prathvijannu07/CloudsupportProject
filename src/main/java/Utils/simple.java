package Utils;

import java.io.FileInputStream;

import Utils.ExcelUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import TestCases.Login;
//import TestCases.Solutions;
//import java.io.IOException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class simple {
	// static WebDriver driver;
	// static String
	// AppUrl="https://mjan.container.webmethodscloud.com/integration/";
	// static Object[][] arrObj;
	static String SheetName = "Solution";
	// @BeforeMethod
	// public void beforeMethod() throws Exception {
	// System.setProperty("webdriver.chrome.driver",
	// "src\\main\\java\\driver\\chromedriver_91.0.4472.19.exe");
	// driver = new ChromeDriver();
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.get(AppUrl);
	// }
	//
	// @Test(dataProvider="Dataprovider")
	// public static void simple1(String sUserName,String sPassword) throws
	// Exception {
	// AppUrl = PropertyHandler.getInstance().getValue("appUrl");
	// Login.Login_TC(driver, sUserName, sPassword);
	// System.out.println(AppUrl);
	// String uname = PropertyHandler.getInstance().getValue("LOGINUSERNAME");
	// String pwd = PropertyHandler.getInstance().getValue("LOGINPASSWORD");

	// driver = new ChromeDriver();
	// driver.manage().window().maximize();
	//
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.get(AppUrl);

	// driver.findElement(By.xpath(PropertyHandler.getInstance().getValue("SolutionsElementPath"))).click();
	// String SolutionElement =
	// PropertyHandler.getInstance().getValue("SolutionsElementPath");
	// String createNewSolution =
	// PropertyHandler.getInstance().getValue("CreateNewSolutionPath");
	// String createsolnFirst =
	// PropertyHandler.getInstance().getValue("CreatesolnFirstXpath");
	// driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
	// driver.findElement(By.xpath(SolutionElement)).click();
	// driver.findElement(By.xpath(createNewSolution)).click();
	// driver.findElement(By.xpath(createsolnFirst)).click();
	// @BeforeMethod
	// public void login() throws Exception {
	// Login.InitDriver();
	// System.out.println("BeforeMethod");
	// }

	@Test(dataProvider = "SolusionDataprovider")
	public void solutionPageTest(String SolutionName, String Description, String Version, String Iscluster,
			String instances, String clusterType, String Core,String Memory_GB,String IS_Name, String packages) throws Exception {
		// ,
		String instancesDropList = PropertyHandler.getInstance().getValue("instancesDropList");
		// PropertyHandler.getInstance().getValue("instancesDropList");
		// System.out.println(SolutionName + " SolutionName" + " Description" + "
		// Version" + " Iscluster" + " instances");
		// System.out.println(instancesDropList + "" + "//*[text()=' instances']");
//		System.out.println(SolutionName);
//		System.out.println(Description);
//				instances.substring(0, instances.length() - 2);
//		System.out.println(instancesDropList + "" + "//*[text()=" + "' " + trim(instances) + "'" + "]");
		String ClusterTypeRadioBtn = PropertyHandler.getInstance().getValue("ClusterTypeRadioBtn");
		System.out.println(ClusterTypeRadioBtn+"[@id='"+clusterType+"']");
//		System.out.println(ClusterTypeRadioBtn+"[@id='"+clusterType+"']");
//		String CreatesolnCore = PropertyHandler.getInstance().getValue("CreatesolnCore");
//		System.out.println(CreatesolnCore+"span[text()=' "+trim(Core)+"']");
//		String CreatesolnMemoryGB = PropertyHandler.getInstance().getValue("CreatesolnMemoryGB");
//		String MemoryGBList = PropertyHandler.getInstance().getValue("MemoryGBList");
//		System.out.println(CreatesolnMemoryGB+"[text()=' "+trim(Memory_GB)+"']");
		
//		trim(Memory_GB)
	}
	private String trim(String Element) {
		String Trimmed= Element.substring(0, Element.length() - 2);
		return Trimmed;
	}

	@DataProvider(name = "SolusionDataprovider")
	public Object[][] CreateSolusionData() throws Exception {
		// System.out.println(SheetName);
		Object[][] data = ExcelUtils.ProvideData(SheetName);

		return data;

	}

}
