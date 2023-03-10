package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import pages.HomePage;
import utilities.ReadConfig;
	
@Listeners({TestListenerClass.class})
public class TestBase implements ITestListener{
	

	public WebDriver driver;
	ReadConfig readConfig = new ReadConfig();
	protected HomePage homePageObj;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br)
	{
		if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readConfig.getFireFoxPath());
			driver = new FirefoxDriver();
			
		}
			
		String baseURL = readConfig.getApplicationURL();
		driver.get(baseURL);
		homePageObj = new HomePage(driver);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
