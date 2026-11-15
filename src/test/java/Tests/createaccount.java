package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.bases;
import Pages.createAccount;

public class createaccount extends bases
{
	
	@Test
	public void create()
	{
	createAccount ac= new createAccount(driver);
	ac.clickchk();
	ac.entername("ranjitha");
	ac.enterpassword("ranjitha29@");
	ac.enterdays();
	ac.entermonths();
	ac.enteryears();
	ac.clickcheck1();
	ac.clickcheck2();
	ac.enterfirstname("Ranjitha");
	ac.enterlastname("Ramu");
	ac.entercompany("abc company");
	ac.enteraddress1("chennai");
	ac.enteraddress2("ariyalur");
	ac.entercountry();
	ac.enterstate("TamilNadu");
	ac.entercity("Chennaii");
	ac.enterzipcode("1235");
	ac.entermobilenumber("1234568809");
	ac.create_account();
	String message=ac.getconfirmationmsg();
	System.out.println(message);
	
	
	Assert.assertEquals(message, "ACCOUNT CREATED!");
	
	
	}

}
