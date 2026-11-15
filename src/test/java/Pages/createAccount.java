package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createAccount extends bases
{
	
  public createAccount(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
  @FindBy(id="id_gender1")
  WebElement Title;
  
  @FindBy(id="name")
  WebElement name;
  
  @FindBy(id="password")
  WebElement password;
  
  @FindBy(id="days")
  WebElement days;
  
  @FindBy(id="months")
  WebElement months;
  
  @FindBy(id="years")
  WebElement years;
  
  @FindBy(id="newsletter")
  WebElement chk_1;
  
  @FindBy(id="optin")
  WebElement chk_2;
  
  @FindBy(id="first_name")
  WebElement enterfirst_name;
  
  @FindBy(id="last_name")
  WebElement enterlast_name;
  
  @FindBy(id="company")
  WebElement entercompany;
  
  @FindBy(id="address1")
  WebElement enteraddress1;
  
  @FindBy(id="address2")
  WebElement enteraddress2;
  
  @FindBy(id="country")
  WebElement entercountry;
  
  @FindBy(id="state")
  WebElement enterstate;
  
  
  @FindBy(id="city")
  WebElement entercity;
  
  @FindBy(id="zipcode")
  WebElement enterzipcode;
  
  @FindBy(id="mobile_number")
  WebElement entermobilenumber;
  
  @FindBy(xpath="//button[@data-qa='create-account']")
  WebElement button1;
  
  @FindBy(xpath="//h2[@data-qa='account-created']")
  WebElement confirmation;
  public void clickchk()
  {
	  if(!Title.isSelected())
	  {
	  Title.click();
	  }
  }
  
  public void entername(String ename)
  {
	  name.sendKeys(ename);
  }
  
  public void enterpassword(String epword)
  {
	  password.sendKeys(epword);
  }
  
  public void enterdays()
  {
	  Select select = new Select(days);
	  select.selectByVisibleText("15");
  }
  
  public void entermonths()
  {
	  Select select = new Select(months);
	  select.selectByVisibleText("July");
  }
  
  
  
  public void enteryears()
  {
	  Select select = new Select(years);
	  select.selectByVisibleText("2005");
  }
  
  public void clickcheck1()
  {
	  chk_1.click();
  }
  
  public void clickcheck2()
  {
	  chk_2.click();
  }
  
  public void enterfirstname(String fname)
  {
	  enterfirst_name.sendKeys(fname);
  }
  
  public void enterlastname(String lname)
  {
	  enterlast_name.sendKeys(lname);
  }
  
  public void entercompany(String company)
  {
	  entercompany.sendKeys(company);
  }
  
  public void enteraddress1(String address1)
  {
	  enteraddress1.sendKeys(address1);
  }
  
  public void enteraddress2(String address2)
  {
	  enteraddress2.sendKeys(address2);
  }
  
  public void entercountry()
  {
	  Select select = new Select(entercountry);
	 select.selectByVisibleText("India");
  }
  public void enterstate(String state)
  {
	  enterstate.sendKeys(state);
  }
  
  public void entercity(String city)
  {
	  entercity.sendKeys(city);
  }
  
  public void enterzipcode(String zip)
  {
	  enterzipcode.sendKeys(zip);
  }
  
  public void entermobilenumber(String num)
  {
	  entermobilenumber.sendKeys(num);
  }
  
  public void create_account()
  {
	  button1.click();
  }
  
  public String getconfirmationmsg() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(confirmation));
	    return confirmation.getText();
	}
  
 
  
  
  
}
