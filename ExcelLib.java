package Danthi.src.com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.ITestResult;

import Danthi.src.com.GenericFunctions.SampleListener;

public class ExcelLib {
	String path="./TestData/test.xlsx";
	@SuppressWarnings("resource")
	public String readExcelData(String SheetName, int RowNum, int ColNum ) throws Throwable
	{
		
		FileInputStream fis=new FileInputStream(path);
		SampleListener sl=new SampleListener();
		try {
			fis = new FileInputStream(path);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			sl.onTestFailure((ITestResult) fis);
			
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new path");
		sc.next(path);
		
		/*
		 *  FileOutputStream fos = null;
      try {
        fos = new FileOutputStream(new File("ExcelSheet.xls"));
        workbook.write(fos);
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        if (fos != null) {
          try {
            fos.flush();
            fos.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
		 */
		//identify workbook
		Workbook wb=WorkbookFactory.create(fis);
		//identify sheet
		Sheet st=wb.getSheet("SheetName");
		//Goto row
		Row row=st.getRow(RowNum);
		//Get cell value
		String data=row.getCell(ColNum).getStringCellValue();
		return data;
	}

	public String writeExcelData(String SheetName, int RowNum, int ColNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis;
		FileOutputStream fos;
		
			try {
				fis = new FileInputStream(path);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("File does not exist...Give a valid path");
				
			}
			fis = new FileInputStream(path);
			//identify workbook
			Workbook wb=WorkbookFactory.create(fis);
			//identify sheet
			Sheet st=wb.getSheet("SheetName");
			//Goto row
			Row row=st.getRow(RowNum);
			//Get cell value
			String data=row.getCell(ColNum).getStringCellValue();
			return data;
		}
}