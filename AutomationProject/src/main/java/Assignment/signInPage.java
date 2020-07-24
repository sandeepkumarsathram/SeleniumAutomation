package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage {
	
	public WebDriver driver;
	
private By username = By.id("login1");
private By password = By.id("password");
private By proceed  = By.xpath("//input[@name='proceed']");
private By text     = By.xpath("//a[@class='signin']");	
private By navigation = By.xpath("//div[@class='secstorybox topboxheight corona topstories']");
//whatsapp automation variables
private By searchbox = By.xpath("//body//label//div[2]");

private By msg = By.xpath("//body/div[@id='app']/div/div/div/div[@id='main']/footer/div/div[2]");
private By smiley = By.xpath("//body/div[@id='app']/div/div/div/div[@id='main']/footer/div[1]/div[1]/div[1]");
private By child = By.xpath("//*[@id=\"main\"]/footer/div[1]/div[1]/div/button[4]/span");
private By smileymsg = By.xpath("//footer//div[5]//div[1]//div[1]//img[1]");
private By crybaby = By.xpath("//body/div[@id='app']/div/div/div/div[@id='main']/footer/div/div/div/div/div/div/div/div[7]/div[1]/img[1]");
//we can declare variable private and method public,so that we could achieve encapsulation.By this the method is accessible directly but not variable.
	public signInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}

	public WebElement proceed() 
	{
		return driver.findElement(proceed);
	}
	
	public WebElement text()
	{
		return driver.findElement(text);
	}
	public WebElement navigation()
	{
		return driver.findElement(navigation);
	}
	public WebElement searchbox()
	{
		return driver.findElement(searchbox);
	}
	
	public WebElement msg()
	{
		return driver.findElement(msg);
	}
	public WebElement smiley()
	{
		return driver.findElement(smiley);
	}
	public WebElement child()
	{
		return driver.findElement(child);
	}
	public WebElement smileymsg()
	{
		return driver.findElement(smileymsg);
	}
	public WebElement crybaby()
	{
		return driver.findElement(crybaby);
	}
}
