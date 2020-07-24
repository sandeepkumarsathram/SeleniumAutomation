package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Port 
{
	 WebDriver driver;
     By searchbyport=By.id("rciHeaderSideNavSubmenu-1-3");
     By rome = By.xpath("//*[@id=\"listOfPorts-2130683718\"]/div/div[14]/div/div/a/div/div/h5");
     
	public Port(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	//clicking on the Search by Port and Choose 'Rome (Civitavecchia) Italy'
	public void selectsearchby_port() throws InterruptedException
	{
		driver.findElement(searchbyport).click();
		Thread.sleep(2000);
		JavascriptExecutor Scroll = ((JavascriptExecutor) driver);
		Scroll.executeScript("window.scrollTo(0,2000)"); 
		Thread.sleep(2000);
		driver.findElement(rome).click();
	}
}
