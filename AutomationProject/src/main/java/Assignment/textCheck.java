package Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class textCheck extends Driverpage
{
	public WebDriver driver;
	@BeforeTest
	public void initialisation() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void textcheck()
	{
		signInPage s3 = new signInPage(driver);
		
		Assert.assertEquals(s3.text().getText(), "Sign in");
	}
	
	@AfterTest
	public void stop()
	{
		driver.close();
	}
	

}
