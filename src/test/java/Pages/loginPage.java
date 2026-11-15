package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends bases
{
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()=' Signup / Login']")
	WebElement signuplogin;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	WebElement password;
	
	@FindBy(xpath="//button[@data-qa='login-button']")
	WebElement loginclick;
	
	@FindBy(xpath="//a[contains(text(),'Logged in as')]")
	WebElement msg;
	
	@FindBy(xpath="//a[contains(text(),' Logout')]")
	WebElement logout;
	
	public void clicksignuplogin()
	{
		signuplogin.click();
	}
	
	public void enteremail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		loginclick.click();
	}
	
	
	
	
	

	public String getlogText()
	{
		return msg.getText();
		
	}
	
	public void clicklogout()
	{
		logout.click();
	}
}
