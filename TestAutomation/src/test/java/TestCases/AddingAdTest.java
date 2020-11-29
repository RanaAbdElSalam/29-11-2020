package TestCases;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Pages.AddingAdPage;


public class AddingAdTest {
	
	AddingAdPage AddingAdObject;
	
	@Test
	public void AddingNewAdTest() throws InterruptedException, IOException {
		
		
		AddingAdObject = new AddingAdPage();
		AddingAdObject.AddAdvertisement();
	
}

}
