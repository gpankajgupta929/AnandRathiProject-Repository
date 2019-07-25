package arEquity;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EquityMethodTC17 
{
	public String getData0() throws Exception 
	
	{
		File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(34).getCell(3).getStringCellValue();
		
		System.out.println("Data from Excel Sheet is.:" + data0);
	
		wb.close();
		
		return data0;
  }
	
	public String getData1() throws Exception
	{
        File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
        XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int data1 = (int) sheet1.getRow(34).getCell(5).getNumericCellValue();
		
		String str = Integer.toString(data1);
		
		System.out.println("Data from Excel Sheet is.:" + data1);
		
		wb.close();
		
		return str;
			
	}
	
	public String getData2() throws Exception
	{
        File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
        XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int data2 = (int) sheet1.getRow(34).getCell(9).getNumericCellValue();
		
		String str = Integer.toString(data2);
		
		System.out.println("Data from Excel Sheet is.:" + data2);
		
		wb.close();
		
		return str;
			
	}
	
	public String getData3() throws Exception
	{
        File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
        XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int data3 = (int) sheet1.getRow(34).getCell(12).getNumericCellValue();
		
		String str = Integer.toString(data3);
		
		System.out.println("Data from Excel Sheet is.:" + data3);
		
		wb.close();
		
		return str;
			
	}
	}