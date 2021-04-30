package com.readexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static String path = "C:\\Users\\Owner\\eclipse-workspace\\PracticeAutomation_Testing\\TestData\\My Credential file.xlsx" ;
	public static void main(String[] args) throws IOException {
		FileInputStream read =new FileInputStream (path);
		XSSFWorkbook workbook =new XSSFWorkbook(read);
		XSSFSheet sheet = workbook.getSheet("Data");
		Iterator <Row> rowiterator =sheet.iterator();
		 rowiterator.next();
		 List<String> list = new ArrayList<>();
		while(rowiterator.hasNext()) {
		list.add(rowiterator.next().getCell(0).getStringCellValue());	
		}
		System.out.println(list);
	}
	

	}
