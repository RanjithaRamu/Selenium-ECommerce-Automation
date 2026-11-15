package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class bases
{
	public static WebDriver driver;
	@BeforeSuite()
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	}
	
//	@AfterSuite()
//public void teardown()
//{
//	driver.quit();
//}
}
