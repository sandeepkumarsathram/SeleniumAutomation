package com.main;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.excel.readexcel;
import com.pages.Homepage;
import com.pages.Port;
import com.pages.Rome;
import com.screenshot.Screenshot;
public class Testmain 
{
  
	WebDriver driver;
	Screenshot sh;
	Homepage hp;
	Port r;
	Rome r1;
	@BeforeTest
	//This method contains the browser driver path and the url to launch
	 public void setup() throws InterruptedException
	{	  
		int drivername;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Chrome broswer testing  and 2 for firefox browser testing");
		drivername=sc.nextInt();
		if(drivername==1)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://www.royalcaribbean.com/alaska-cruises");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 }
		 else if(drivername==2)
		 {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			  driver = new FirefoxDriver();
		      driver.get("https://www.royalcaribbean.com/alaska-cruises");
		      driver.manage().window().maximize();
		      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 }
		 else
		 {
			  System.out.println("Another Browser is not available");
		 } 
	}
	@Test
	public void testexecute() throws FileNotFoundException, Exception
	{
		//calling the constructors sending the drivers
		sh=new Screenshot(driver);
		hp=new Homepage(driver);
		r=new Port(driver);
		r1=new Rome(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		if(hp.check())
			Reporter.log("Whale watching link is present on the page");
		else
			Reporter.log("Whale watching link is not present on the page");
		
		Thread.sleep(2000);
		hp.plan_a_cruise();
		Thread.sleep(2000);
		r.selectsearchby_port();
		Thread.sleep(2000);
		r1.firstresult();
		Thread.sleep(2000);
		readexcel r2=new readexcel(driver);
		Thread.sleep(2000);
		r2.storemessageintoexcel();
		Thread.sleep(2000);
		sh.takeScreenshot(driver,"C:\\Users\\dell\\eclipse-workspace\\Cruise_to_alaska\\src\\com\\screenshot\\screenshot1.png");	
	}
	
	//Closing the Opening Browser
	@AfterTest
	public void close() throws InterruptedException
	{
		driver.close();
	}
}
