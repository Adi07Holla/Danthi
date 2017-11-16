package com.Excel;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.ITestResult;

import com.GenericFunctions.SampleListener;

public class ExcelLib {
	
	//global declaration
	String path="./TestData/test.xlsx";
	String Val="";
	FileInputStream fis;
	FileOutputStream fos;
		
	//object creation
	SampleListener sl=new SampleListener();
	Workbook wb;
	Sheet st;
	Row row;
	Cell cel;
	String SheetName;
	int RowNum;
	
	//function to open a file
	private FileInputStream getFileInputStream(String path) throws FileNotFoundException
	{
		return this.fis=new FileInputStream(path);
	}
		
	//function to write into a file
	public FileOutputStream getFileOutputStream() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		return this.fos=new FileOutputStream(path);
	}
	
	//function to get workbook
	public org.apache.poi.ss.usermodel.Workbook getWorkbook(String path2) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		//read workbook
		return this.wb=WorkbookFactory.create(getFileInputStream(path2));
	}
	
	//function to access sheet
	public Sheet getSheet(String SheetName2)
	{
		return this.wb.getSheet(SheetName2);
		
	}
	
	//function to access row
	public Row createRow()
	{
		return this.st.createRow(RowNum);
	}
	
	//function to get row
	public Row getRow(int RowNum)
	{
		Row row =st.getRow(RowNum);
		return row;
	}
		
	//function to create cell
		
	public Cell createCell()
	{
		return this.row.createCell(RowNum);
	}
	
	//function to get cell
		
	public Cell getCell()
	{
		return this.row.getCell(RowNum);
	}
	
	//function to get Last row
	public int getLastRowNum()
	{
		return this.st.getLastRowNum();
	}
		
	//function to get Last cell number of row
	public  short getLastCellNumber()
	{
		return this.row.getLastCellNum(); 
	}
	
	public void LastColNum()
	{
		
	}
	
	public void ReadAlldata(String s)
	{
		
	}
	public void SetColor(int RowNum,int ColNum)
	{
		
	}
	
}