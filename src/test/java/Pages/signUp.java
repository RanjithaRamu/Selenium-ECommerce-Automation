package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUp extends bases
{
	public signUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	WebElement signuplogin;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement email;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement signup_click;
	
	public void signuplogin()
	{
		signuplogin.click();
	}
	
	public void enterusername(String ename)
	{
		name.sendKeys(ename);
	}
	public void enteremail(String eemail)
	{
		email.clear();
		   email.sendKeys(eemail);
	}
	
	public void signupclick()
	{
		 signup_click.click();
	}
	
	
	
	
	
	

}
