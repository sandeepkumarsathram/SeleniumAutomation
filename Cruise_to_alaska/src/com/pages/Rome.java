package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Rome 
{
	WebDriver driver;
	
	By view1date = By.xpath("//div[@class='slick-track']/div[@class='carouselItem__base slick-slide slick-current slick-active']//div[@class='carouselItem__book']");
	
	public Rome(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	//Clicking on the view 1 date under first result
	public void firstresult() throws InterruptedException
	{
		JavascriptExecutor Scroll = ((JavascriptExecutor) driver);
		Scroll.executeScript("window.scrollTo(0,1200)"); 
		Thread.sleep(2000);
		driver.findElement(view1date).click();
		Thread.sleep(2000);
		JavascriptExecutor Scroll1 = ((JavascriptExecutor) driver);
		Scroll1.executeScript("window.scrollTo(0,250)"); 
	}
}
