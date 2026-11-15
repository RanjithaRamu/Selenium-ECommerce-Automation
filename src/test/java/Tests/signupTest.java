package Tests;


import org.testng.annotations.Test;

import Pages.bases;
import Pages.signUp;

public class signupTest extends bases
{

	@Test
	 public void signup()
	 {
	     signUp lp=new signUp(driver);
	       lp.signuplogin();
	       lp.enterusername("ramu");
	       lp.enteremail("ramu15@gmail.com");
	       lp.signupclick();
	       String url=driver.getCurrentUrl();
	       System.out.println(url);
	     
	 }
}
