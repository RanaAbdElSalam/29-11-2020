package Pages;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import core.Page_Base;

public class SearchNewCarPage {
	
	Page_Base base;
	
	public void search() throws InterruptedException {
		
		base = new Page_Base();
		WebDriver driver = base.webDriver();
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);		
		driver.get("https://www.contactcars.com/");
				
		Select drpMake = new Select(driver.findElement(By.name("mk")));
		drpMake.selectByVisibleText("كيا");
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);		

		Select drpModel = new Select(driver.findElement(By.name("md")));
		drpModel.selectByVisibleText("ريو");
		
		driver.findElement(By.id("btnnewsearch")).click(); 		
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.linkText("1.6 A/T H/L New Shape Sedan")).click();
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);	
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		String carInstallment = driver.findElement(By.linkText("6,942 ج.م./شهر")).getText();
		
		System.out.println(carInstallment);
}}
