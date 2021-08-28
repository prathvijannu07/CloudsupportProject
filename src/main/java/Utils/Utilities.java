//package Utils;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
///**
// * Hello world!
// *
// */
//public class Utilities 
//{
//	String ExelPath=System.getProperty("user.dir");
//	public Utilities(int sheetNo,int rowNo,int colNum) throws IOException {
//		FileInputStream fis=new FileInputStream(ExelPath+"/ExelFiles/userData.xlsx");  
//		XSSFWorkbook wb=new XSSFWorkbook(fis);   
//		XSSFSheet sheet=wb.getSheetAt(sheetNo); 
//		String name=sheet.getRow(rowNo).getCell(colNum).getStringCellValue();
//		System.out.println(name);
//		
//
//	 
//    }
//	
//}
