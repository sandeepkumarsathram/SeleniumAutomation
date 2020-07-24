package Assignment;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Assignment.Driverpage;
public class HomePage extends Driverpage{
	
	public WebDriver driver;
	
	private static Logger Log = LogManager.getLogger(Driverpage.class.getName());
	@BeforeTest
	public void initialisation() throws IOException
	{
		
		driver = initializeDriver();
		Log.info("DriverInitialised");
		driver.get(prop.getProperty("url"));
		Log.info("URL Etered");
	}
	
	@Test(dataProvider="getData")
	public void Homepage(String username,String password) throws IOException, InterruptedException
	{
		
		
		//to click signin button
		signinClick s = new signinClick(driver);
		s.signinButton().click();
		
		
		//to enter details into signin page 
		signInPage s1 = new signInPage(driver);
		s1.username().sendKeys(username);
		
		s1.password().sendKeys(password);
		s1.proceed().click();
		
		
		
		Log.info("Login details entered");
		
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new Object[1][2];
		
		data[0][0] = "MyMail@Com.com";
		data[0][1] = "passw0rd";
		
		/*data[1][0] = "YourMail@Com.com";
		data[1][1] = "P@ssw0rd";*/
		return data;
		
	}
	@AfterTest
	public void stop()
	{
		driver.close();
	}

}
