package login;
import org.testng.annotations.Test;

import baseclass.BaseClass;
//import pages.WelcomePage;
import pages.Login;

public class RunLogin extends BaseClass {
	@Test
	public void runLogin() {
		System.out.println(driver);
		Login lp=new Login();
		lp.enterUname().enterPwd().clickLogin().clickCrmsfa().myLeads().leadpage().createlead().viewlead();
		
		
	}

}