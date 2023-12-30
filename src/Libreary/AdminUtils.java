package Libreary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import App_Utils.UtilsDemo;

public class AdminUtils extends UtilsDemo
{
   public static String adminuid = "Admin";
   public static String adminpwd = "Qedge123!@#";
	
   Login ram;
   
   @BeforeTest
	public void adminLogin()
	{
		
	    ram = new Login();
		ram.login(adminuid,adminpwd);
		
		
	}
	
   
   @AfterTest
	public void adminLogout() 
	{
		
		ram.logout();
		
		
	}
   
   

}
