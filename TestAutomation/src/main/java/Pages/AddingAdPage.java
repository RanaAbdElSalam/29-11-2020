package Pages;

import java.io.IOException;
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

public class AddingAdPage {

	Page_Base base;
	
	public void AddAdvertisement() throws InterruptedException, IOException {
		
		base = new Page_Base();
		WebDriver driver = base.webDriver();
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);		
		driver.get("https://www.contactcars.com/");
		
	if ((driver.findElement(By.xpath("/html/body/div[5]/div/div/nav/section/ul[2]/li[1]/a"))).isEnabled())
	{
		WebElement LoginSection = driver.findElement(By.xpath("/html/body/div[5]/div/div/nav/section/ul[2]/li[1]/a"));
		LoginSection.click();
		
		WebElement ContactRegistration = driver.findElement(By.xpath("/html/body/div[5]/div/div/nav/section/ul[2]/li[1]/ul/li[1]/a"));
		ContactRegistration.click();
		
		WebElement EmailField = driver.findElement(By.id("Email"));
		EmailField.sendKeys("rana.1995@hotmail.com");
		
		WebElement PasswordField = driver.findElement(By.id("Password"));
		PasswordField.sendKeys("test123456");
		
		WebElement LoginBtn = driver.findElement(By.id("btnlogin"));
		LoginBtn.click();
	}
		
	WebElement AddAd = driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[6]/a"));
	AddAd.click();
	
	WebElement AddUsedCar = driver.findElement(By.linkText("اضف سيارة مستعملة"));	
	AddUsedCar.click();		
	
	Select drpMake = new Select(driver.findElement(By.name("make")));
	drpMake.selectByVisibleText("أودي");
	
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);		

	Select drpModel = new Select(driver.findElement(By.name("ModelID")));
	drpModel.selectByVisibleText("A4");
	
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);		

	Select drpShape = new Select(driver.findElement(By.name("ShapeTypeID")));
	drpShape.selectByVisibleText("4x4");
	
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);		

	Select drpMakeYear = new Select(driver.findElement(By.name("MakeYear")));
	drpMakeYear.selectByVisibleText("2012");
	
	WebElement CCValue = driver.findElement(By.id("CC"));
	CCValue.sendKeys("1200");
	
	WebElement KmValue = driver.findElement(By.id("KiloMeters"));
	KmValue.sendKeys("300");
	
	WebElement CarPrice = driver.findElement(By.id("Price"));
	CarPrice.sendKeys("300000");
	
	WebElement GearBoxRadioBtn = driver.findElement(By.id("GearBoxAutMan"));							
	GearBoxRadioBtn.click();
	
	WebElement DoorsNumRadioBtn = driver.findElement(By.xpath("/html/body/div[7]/div/section[2]/div[2]/div/form/div[2]/div[3]/div[2]/div[2]/label/input"));							
	DoorsNumRadioBtn.click();
	
	WebElement FabrikaRadioBtn = driver.findElement(By.xpath("/html/body/div[7]/div/section[2]/div[2]/div/form/div[2]/div[3]/div[3]/div[2]/label/input"));							
	FabrikaRadioBtn.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	
	WebElement AboutCar = driver.findElement(By.id("NotesAr"));
	AboutCar.sendKeys("Testing Adding an Ad for a Used Car");
	
	
	WebElement AddPhoto = driver.findElement(By.id("pickfiles"));
	AddPhoto.click();
	
	Runtime.getRuntime().exec(System.getProperty("user.dir") + "/resources/AutoItScript.exe");
	
	driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);	

	
	WebElement PhoneNumber = driver.findElement(By.id("Telephones"));
	PhoneNumber.sendKeys("01114858070");
	
	Select drpCities = new Select(driver.findElement(By.name("cities")));
	drpCities.selectByVisibleText("الإسكندرية");
	
	Select drpLocations = new Select(driver.findElement(By.name("LocationIDs")));
	drpLocations.selectByVisibleText("ابو قير");
	
	
	WebElement InfoAgreement = driver.findElement(By.id("newadagree"));
	InfoAgreement.click();
	
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);	
	
	
	WebElement SaveBtn = driver.findElement(By.id("btnSub"));
	SaveBtn.click();
	
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);	
	
	System.out.println(driver.findElement(By.xpath("/html/body/div[7]/div/section[2]/div[2]/div/form/div[2]/div[1]/div/div/ul/li")).getText());
	
	
	
	
}
}
