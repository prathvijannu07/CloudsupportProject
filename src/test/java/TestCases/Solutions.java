package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestCases.Login;
import Utils.BaseTestClass;
import Utils.ExcelUtils;
import Utils.PropertyHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import TestCases.Login;

public class Solutions extends BaseTestClass {
	static String SheetName = "Solution";

	// @BeforeMethod
	// public static void CreateSolutions() throws Exception {
	//
	// BaseTestClass.InitDriver();
	// System.out.println("BeforeMethod");
	// }

	@Test(dataProvider = "SolusionDataprovider")
	public void solutionPageTest(String SolutionName, String Description, String Version, String Iscluster,
			String instances, String clusterType, String Core, String Memory_GB, String IS_Name, String packages)
			throws Exception {

		String SolutionElement = PropertyHandler.getInstance().getValue("SolutionsElementPath");
		String MonitoringElement = PropertyHandler.getInstance().getValue("MonitoringElementXpath");
		String createNewSolution = PropertyHandler.getInstance().getValue("CreateNewSolutionPath");
		String createsolnFirst = PropertyHandler.getInstance().getValue("CreatesolnFirstXpath");
		String createsolnsecond = PropertyHandler.getInstance().getValue("CreatesolnsecondXpath");
		String createsolnThird = PropertyHandler.getInstance().getValue("CreatesolnThirdXpath");
		String createsolnOK = PropertyHandler.getInstance().getValue("createsolnOKButton");
		// ------------------------------------------------------------------------------------------------------------------//
		String createsolnNamePath = PropertyHandler.getInstance().getValue("CreatesolnNamePath");
		String solutionsNameTxT = PropertyHandler.getInstance().getValue("CreatesolnNameText");
		String createsolnDesc = PropertyHandler.getInstance().getValue("CreatesolnDescXpath");
		String createsolnDescText = PropertyHandler.getInstance().getValue("CreatesolnDescText");
		String createsolnVer = PropertyHandler.getInstance().getValue("CreatesolnVersion");
		String CreatesolnVersion= PropertyHandler.getInstance().getValue("CreatesolnVersion");
//		String createsolnVer1 = PropertyHandler.getInstance().getValue("CreatesolnVersion_10.7");
//		String createsolnVer2 = PropertyHandler.getInstance().getValue("CreatesolnVersion_10.5");
		// ------------------------------------------------------------------------------------------------------------------//
		String CreatesolnNameDropdown = PropertyHandler.getInstance().getValue("CreatesolnNameArrow");
		String CreatesolnName2Input = PropertyHandler.getInstance().getValue("CreatesolnName2InputPath");
		String createsolnName2Text = PropertyHandler.getInstance().getValue("CreatesolnName2");
		String ClusterCheckBox = PropertyHandler.getInstance().getValue("ClusterCheckBox");
		String instancesDrop = PropertyHandler.getInstance().getValue("instancesDrop");
		String instancesDropList = PropertyHandler.getInstance().getValue("instancesDropList");
		String instnc = instances.substring(0, instances.length() - 2);
		String ClusterTypeRadioBtn = PropertyHandler.getInstance().getValue("ClusterTypeRadioBtn");
		// String instancesDropList2 =
		// PropertyHandler.getInstance().getValue("instancesDropList2");
		// String instancesDropList3 =
		// PropertyHandler.getInstance().getValue("instancesDropList3");
		// String instancesDropList4 =
		// PropertyHandler.getInstance().getValue("instancesDropList4");
		// ------------------------------------------------------------------------------------------------------------------//
		String CreatesolnCore = PropertyHandler.getInstance().getValue("CreatesolnCore");

		// ------------------------------------------------------------------------------------------------------------------//
		String CreatesolnMemoryGB = PropertyHandler.getInstance().getValue("CreatesolnMemoryGB");
		String MemoryGBList = PropertyHandler.getInstance().getValue("MemoryGBList");
		String CreatesolnMemoryList2 = PropertyHandler.getInstance().getValue("CreatesolnMemoryList2");
		String CreatesolnMemoryList4 = PropertyHandler.getInstance().getValue("CreatesolnMemoryList4");
		String CreatesolnMemoryList6 = PropertyHandler.getInstance().getValue("CreatesolnMemoryList6");
		String CreatesolnMemoryList8 = PropertyHandler.getInstance().getValue("CreatesolnMemoryList8");
		String CreatesolnMemoryList16 = PropertyHandler.getInstance().getValue("CreatesolnMemoryList16");
		String CreatesolnFixBtn = PropertyHandler.getInstance().getValue("CreatesolnFixBtn");
		String CreatesolnFixDrop1 = PropertyHandler.getInstance().getValue("CreatesolnFixDrop1");
		// ------------------------------------------------------------------------------------------------------------------//
		// String CreatesolnPackagesNameAll =
		// PropertyHandler.getInstance().getValue("CreatesolnPackagesNameAll");
		// String PackagesFilter =
		// PropertyHandler.getInstance().getValue("PackagesFilter");
		// String PackagesFilterByInput =
		// PropertyHandler.getInstance().getValue("PackagesFilterByInput");
		// String Packages_WmBusinessRules =
		// PropertyHandler.getInstance().getValue("Packages_WmBusinessRules");
		// String Packages_WmCloudStreams =
		// PropertyHandler.getInstance().getValue("Packages_WmCloudStreams");
		// String Packages_WmEDI =
		// PropertyHandler.getInstance().getValue("Packages_WmEDI");
		// String Packages_WmEDIINTStub =
		// PropertyHandler.getInstance().getValue("Packages_WmEDIINTStub");
		// String Packages_WmEDIforTNStub =
		// PropertyHandler.getInstance().getValue("Packages_WmEDIforTNStub");
		// String Packages_WmFlatFile =
		// PropertyHandler.getInstance().getValue("Packages_WmFlatFile");
		// String Packages_WmJDBCAdapter =
		// PropertyHandler.getInstance().getValue("Packages_WmJDBCAdapter");
		// String Packages_WmMQAdapter =
		// PropertyHandler.getInstance().getValue("Packages_WmMQAdapter");
		// String Packages_WmTNStub =
		// PropertyHandler.getInstance().getValue("Packages_WmTNStub");

		driver.findElement(By.xpath(SolutionElement)).click();
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath(createNewSolution)).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// Thread.sleep(3000);
		driver.findElement(By.xpath(createsolnFirst)).click();
		driver.findElement(By.xpath(createsolnOK)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(createsolnNamePath)).sendKeys(SolutionName);
		Thread.sleep(1000);
		driver.findElement(By.xpath(createsolnDesc)).sendKeys(Description);
		Thread.sleep(1000);
		driver.findElement(By.xpath(createsolnVer)).click();
		// Select select = new Select(driver.findElement(By.xpath(createsolnVer)));
		// select.selectByVisibleText("10.5");
		Thread.sleep(1000);
		driver.findElement(By.xpath(CreatesolnVersion+"[text()=' "+Version+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(CreatesolnNameDropdown)).click();
		driver.findElement(By.xpath(CreatesolnName2Input)).sendKeys(IS_Name);
		Thread.sleep(4000);
		WebElement ClusterCheckbox = driver.findElement(By.xpath(ClusterCheckBox));
//		ClusterCheckbox.click();
		if (ClusterCheckbox.isSelected()) {
			driver.findElement(By.xpath(instancesDrop)).click();
			Thread.sleep(2000);
			// System.out.println(instancesDropList + "" + "//*[text()=" + "' " + instnc +
			// "'" + "]");
			driver.findElement(By.xpath(instancesDropList + "" + "//*[text()=" + "' " + instnc + "'" + "]")).click();
		} else {
			ClusterCheckbox.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(instancesDrop)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(instancesDropList + "" + "//*[text()=" + "' " + instnc + "'" + "]")).click();

		}
		scrollElement(driver.findElement(By.xpath(instancesDrop)));
		Thread.sleep(2000);
		//div[@class="solution-data-form ng-star-inserted"]//div[@class="data-fields"]//div[@class="ng-star-inserted"]
//		driver.findElement(By.xpath(ClusterTypeRadioBtn+"[@id='"+clusterType+"']")).click();
//		driver.findElement(By.xpath(ClusterTypeRadioBtn+"[@id='"+clusterType+"']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(CreatesolnCore + "span[text()=' " + trim(Core) + "']")).click();
//		Thread.sleep(2000);
//		scrollElement(driver.findElement(By.xpath(CreatesolnMemoryGB)));
//		driver.findElement(By.xpath(CreatesolnMemoryGB)).click();
//		driver.findElement(By.xpath(CreatesolnMemoryList4)).click();
//		driver.findElement(By.xpath(CreatesolnMemoryGB+"[text()=' "+trim(Memory_GB)+"']")).click();
//		scrollElement(driver.findElement(By.xpath(CreatesolnFixBtn)));
//		driver.findElement(By.xpath(CreatesolnFixBtn)).click();
//		driver.findElement(By.xpath(CreatesolnFixDrop1)).click();
//		Thread.sleep(1000);

//		String[] animalsArray = packages.split(",");
//		for (String s : animalsArray) {
//			// Do your stuff here
//			driver.findElement(By.xpath("/*[contains(text(),'" + s + "')]")).click();
//		}

	}

	private String trim(String Element) {
		String Trimmed = Element.substring(0, Element.length() - 2);
		return Trimmed;
	}

	public void scrollElement(WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	@DataProvider(name = "SolusionDataprovider")
	public Object[][] CreateSolusionData() throws Exception {
		// System.out.println(SheetName);
		Object[][] data = ExcelUtils.ProvideData(SheetName);

		return data;

	}

	// @AfterTest
	// public void QuitDriver() {
	// driver.close();
	// }

}

// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-div-inprogress")));
// String SolutionsElement = PropertyHandler.getInstance().getValue("");
// String SolutionsElement = PropertyHandler.getInstance().getValue("");
// String SolutionsElement = PropertyHandler.getInstance().getValue("");

// WebElement versionElement1 = driver.findElement(By.xpath(createsolnVer));
// if (versionElement1.toString().) {
// driver.findElement(By.xpath(createsolnVer2)).click();
// } else
// driver.findElement(By.xpath(createsolnVer1)).click();

// Select select = new Select(driver.findElement(By.xpath(createsolnVer)));
// select.deselectByVisibleText("10.7");
// driver.findElement(By.xpath("createsolnName2")).sendKeys(createsolnName2Text);
// driver.findElement(By.xpath("createsoln_inst")).click();
// driver.findElement(By.xpath("createsolncore")).click();
// driver.findElement(By.xpath("createsolnMemo")).click();
// driver.findElement(By.xpath("createsolnFix")).click();
// driver.findElement(By.xpath("SolutionsElement")).

// Thread.sleep(3000);
