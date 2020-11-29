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
import Pages.SearchNewCarPage;

public class SearchNewCarTest {

	SearchNewCarPage SearchNewCarObject;
	
	@Test
	public void SearchTest() throws InterruptedException {
		
		
		SearchNewCarObject = new SearchNewCarPage();
		SearchNewCarObject.search();
	
}
	
}
