package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.util.FileCopyUtils;

public class Screenshot 
{
   WebDriver driver;
	public Screenshot(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	//The method is used to take screenshot and save it in a spcified location
	public void takeScreenshot(WebDriver driver,String Pathtosave) throws IOException, InterruptedException
    {  
    Thread.sleep(1000); 
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    java.io.File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);  
    File DestFile=new File(Pathtosave);
    FileCopyUtils.copy(SrcFile,DestFile);
    }

}
