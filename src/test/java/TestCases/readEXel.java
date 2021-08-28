package TestCases;

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

public class readEXel {
	static Sheet ExcelWSheet;
	// private static HSSFWorkbook ExcelWBookH;
	static Workbook ExcelWBook;
	static FileOutputStream fos;
	static int CellNum;
	static Row row;
	static Cell cell;
//	static String sheetName = "Users";
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
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		RowNum = ExcelWSheet.getLastRowNum() - 1;
		CellNum = ExcelWSheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[RowNum][CellNum];
		for (int i = 1; i < RowNum; i++) {
			for (int j = 0; j < CellNum; j++) {
				data[i-1][j] = ExcelWSheet.getRow(i).getCell(j).toString();
				System.out.println(data[i-1][j]);
			}
			System.out.println("");
		}
		return data;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		readEXel.ProvideData(SheetName);
//
//	}

}
