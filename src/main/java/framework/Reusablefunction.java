package framework;

import Baseclasses.Baseclass;
import pages.Amazonpage;
import pages.Testpage;

public class Reusablefunction{
	public static void login(String email, String password) throws Exception
	{
		Baseclass.getDriver();
		CommonMethods.clickOnElementUsingActions(Amazonpage.hellosignin);
		CommonMethods.waitForVisibility(Amazonpage.Email);
		TextBoxHelper.settext(Amazonpage.Email, email);
		CommonMethods.clickOnElementUsingActions(Amazonpage.Submitbutton);
		TextBoxHelper.settext(Amazonpage.password, password);
		CommonMethods.clickOnElementUsingActions(Amazonpage.signin);
		
		
	}
	public static void Enterusername(String username) throws Exception
	{
		  Baseclass.getDriver();
		   CommonMethods.waitForVisibility(Testpage.Email);
		   TextBoxHelper.settext(Testpage.Email, username);
	}

}
