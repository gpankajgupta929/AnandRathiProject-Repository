package arEquity;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EquityMethodTC10 
{
	public String getData0() throws Exception 
	
	{
		File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(20).getCell(3).getStringCellValue();
		
		System.out.println("Data from Excel Sheet is.:" + data0);
		
		//String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
		
		wb.close();
		
		return data0;
  }
	
	public String getData1() throws Exception
	{
        File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
        XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int data1 = (int) sheet1.getRow(20).getCell(5).getNumericCellValue();
		
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
		
		int data1 = (int) sheet1.getRow(20).getCell(10).getNumericCellValue();
		
		String str = Integer.toString(data1);
		
		System.out.println("Data from Excel Sheet is.:" + data1);
		
		wb.close();
		
		return str;
			
	}
	
	public String getData3() throws Exception
	{
        File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
        XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int data1 = (int) sheet1.getRow(20).getCell(12).getNumericCellValue();
		
		String str = Integer.toString(data1);
		
		System.out.println("Data from Excel Sheet is.:" + data1);
		
		wb.close();
		
		return str;
			
	}
	}