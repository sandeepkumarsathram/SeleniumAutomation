package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class Homepage 
{
	 WebDriver driver;
	 By whalewatch=By.linkText("whale watching tour");
	 By menu = By.id("rciHeaderOpenSidenav");
	 By plan_a_cruise=By.xpath("//*[@id=\"rciHeaderSideNavMenu-1\"]");		
	 
	public Homepage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	//checking for presence of whale watching link
	public boolean check()
	{
		JavascriptExecutor Scroll = ((JavascriptExecutor) driver);
		Scroll.executeScript("window.scrollTo(0,2000)"); 
		boolean res;
		res=driver.findElement(whalewatch).isDisplayed();
		return res;
	}
	//clicking on the 'Plan a Cruise' link
	public void plan_a_cruise() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(menu).click();
		Thread.sleep(2000);
		driver.findElement(plan_a_cruise).click();	
	}
}
