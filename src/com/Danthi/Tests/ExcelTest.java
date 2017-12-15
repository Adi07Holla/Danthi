package com.Danthi.Tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.Excel.ExcelLib;

public class ExcelTest {
public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
	ExcelLib eLib=new ExcelLib();
String 	path="./TestData/test.xlsx";
String SheetName="Sheet1";
int RowNum=1;
	System.out.println("Finished");
	eLib.getWorkbook(path);
	eLib.getSheet(SheetName);
	System.out.println("Sheet opened");
	eLib.getRow(RowNum);
	System.out.println();
	
	}
}
