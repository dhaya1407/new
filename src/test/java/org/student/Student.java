package org.student;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Student {
	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions g = new ChromeOptions();
		g.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(g);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement findElement = driver.findElement(By.id("Skills"));
		
		Select select = new Select(findElement);
		List<WebElement> options = select.getOptions();
		
		int size = options.size();
		System.out.println(size);
		File file = new File("C:\\Users\\dhaya\\eclipse-workspace\\Employee\\excel\\dhaya.xlsx");
		
		Workbook v = new XSSFWorkbook();
		Sheet createSheet = v.createSheet("Sheet");
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			
			String text = webElement.getText();
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			
			FileOutputStream s = new FileOutputStream(file);
			v.write(s);
			
			
		}
			
		}
		
}
			
		
		
		


