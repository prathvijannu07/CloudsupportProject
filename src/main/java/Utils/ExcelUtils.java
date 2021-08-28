package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
  

public class ExcelUtils {

	static Sheet ExcelWSheet;
	// private static HSSFWorkbook ExcelWBookH;
	static Workbook ExcelWBook;
	static FileOutputStream fos;
	static int CellNum;
	static Row row;
	static Cell cell;
	static DataFormatter formatter = new DataFormatter();
	static int RowNum;

	static String file_location = "D:\\My practice\\CloudsupportProject\\TestData\\ReadData.xlsx";

	public static Object[][] ProvideData(String SheetName) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file_location);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {

			ExcelWBook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (InvalidFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		// System.out.println("############"+SheetName);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		RowNum = ExcelWSheet.getLastRowNum();
		CellNum = ExcelWSheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[RowNum][CellNum];
//		System.out.println("[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]");
//		System.out.println("Row :" + RowNum);
//		System.out.println("Col :" + CellNum);
		for (int i = 1; i <= RowNum; i++) {
			for (int j = 0; j < CellNum; j++) {
				data[i - 1][j] = ExcelWSheet.getRow(i).getCell(j).toString();
				// System.out.println(data[i][j]);
			}
		}

//		for (int i = 0; i <= RowNum - 1; i++) {
//			System.out.println("+++++++++++++++++++++++Data from Row:" + i);
//			for (int j = 0; j < CellNum; j++) {
//				System.out.println(data[i][j]);
//			}
//			System.out.println();
//		}
		return data;
	}

	// public static void write(String SheetName, WebElement confirmationMessage)
	// throws IOException {
	//
	// String filepath = (file_location);
	// File file = new File(filepath);
	// fos = new FileOutputStream(file);
	//
	// ExcelWBook = new XSSFWorkbook();
	//
	// if (confirmationMessage.isDisplayed()) {
	// for (int i = 0; i < RowNum; i++) {
	// for (int j = 0; j < CellNum; j++) {
	// cell.setCellValue("FAIL");
	//
	// }
	// }
	// } else {
	//
	// cell.setCellValue("PASS");
	// }
	//
	// fos = new FileOutputStream(file_location);
	// ExcelWBook.write(fos);
	//
	// }
}