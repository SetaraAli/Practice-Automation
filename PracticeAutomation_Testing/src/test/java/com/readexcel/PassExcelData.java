package com.readexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ups.nj.supperpage.SupperClass;

public class PassExcelData extends SupperClass {
public static String path = "C:\\Users\\Owner\\eclipse-workspace\\PracticeAutomation_Testing\\TestData\\My Credential file.xlsx";
public ArrayList<String> readExcel(int colnom) throws IOException{
	FileInputStream read = new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(read);
	XSSFSheet sheet =workbook.getSheet("Data");
	Iterator <Row> rowiterator = sheet.iterator();
	rowiterator.next();
	ArrayList<String> list =new ArrayList<>();
	while(rowiterator.hasNext()) {
	list.add(rowiterator.next().getCell(colnom).getStringCellValue());
		
	}
	return list;
}

@Test
public void LoginZoplaWebpage() throws IOException {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.zoopla.co.uk/");
	
driver.findElement(By.xpath("(//*[text()='Accept all cookies'])[2]")).click();
driver.findElement(By.xpath("(//*[@data-testid='header-profile-sign-in'])[2]")).click();
ArrayList<String> userName=readExcel(0);

ArrayList<String> pwd =readExcel(1);

for(int i=0;i<userName.size();i++) {

driver.findElement(By.id("input-email-address")).sendKeys(userName.get(i));
driver.findElement(By.id("input-password")).sendKeys(pwd.get(i));
driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();

}
}
}
//(//*[@data-testid='header-profile-sign-in'])[2]
	//id("input-email-address")
	//id("input-password")
	//[@data-testid='signin-button']