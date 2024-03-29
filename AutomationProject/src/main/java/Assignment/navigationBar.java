package Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class navigationBar extends Driverpage {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialisation() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void navigationBarCheck()
	{
		signInPage s2 = new signInPage(driver);
		Assert.assertTrue(s2.navigation().isDisplayed());
	}

	@AfterTest
	public void stop()
	{
		driver.close();
	}
}
