package Tests;

import org.testng.annotations.Test;

import Pages.bases;
import Pages.loginPage;
import junit.framework.Assert;

public class login extends bases
{
	
	@Test
	public void login()
	{
	loginPage l1=new loginPage(driver);
	l1.clicksignuplogin();
	l1.enteremail("ramu15@gmail.com");
	l1.enterpassword("ranjitha29@");
	l1.clicklogin();
String confirmText=	l1.getlogText();
System.out.println(confirmText);

Assert.assertTrue(confirmText.contains("Logged in as ramuranjitha"));

l1.clicklogout();
	
	}
}
