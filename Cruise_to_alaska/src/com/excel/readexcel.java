//This class is used to read input data from excel sheet using apache POI
package com.excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class readexcel 
{
	WebDriver driver;
	public readexcel(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	//This method stores the error message into excel sheet
	public void storemessageintoexcel() throws Exception
	{
	    File file = new File("C:\\Users\\dell\\eclipse-workspace\\Cruise_to_alaska\\out.xlsx");
	    
	    By text = By.xpath("//div[@class='product-view-itinerary-overview__schedule product-view--hidden-mobile-tablet']");
	    
	    
	    try
		{
	    	FileInputStream file1 = new FileInputStream(file);		
			XSSFWorkbook wb = new XSSFWorkbook(file1);
			XSSFSheet sh = wb.getSheet("Sheet1");
			
			sh.createRow(0).createCell(0).setCellValue(driver.findElement(text).getText());
			
			System.out.println("File Found");
			FileOutputStream file2 = new FileOutputStream(file);
			wb.write(file2);
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	    
    }

}