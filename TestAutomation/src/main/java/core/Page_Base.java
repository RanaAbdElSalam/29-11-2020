package core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_Base {
	
	
	public JavascriptExecutor jse ; 
	public Select select ; 
	public Actions action ; 

	// create constructor 
//	public Page_Base(WebDriver driver) 
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	public WebDriver webDriver() 
	{
		System.setProperty("webdriver.http.factory", "apache");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;		
	}
	
	
	protected static void clickButton(WebElement button) 
	{
		button.click();
	}
	
	protected static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}
	
	public void scrollToBottom() 
	
	{
		jse.executeScript("scrollBy(0,2500)"); 
	}
	
	public void clearText(WebElement element) 
	{
		element.clear();
	}
	
	public void selectlist(String value , WebElement webElement ) {
		Select select = new Select(webElement);
		select.selectByVisibleText(value);
	}
	

}
