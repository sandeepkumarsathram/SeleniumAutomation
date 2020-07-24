package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signinClick 
{
	
	public WebDriver driver;
By signin = By.xpath("//a[@class='signin']");

public signinClick(WebDriver driver)
{
	this.driver=driver;
}

public WebElement signinButton()
{
	return driver.findElement(signin);
}

}
