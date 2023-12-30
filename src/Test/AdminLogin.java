package Test;

import java.io.IOException;

import org.slf4j.helpers.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

import App_Utils.XL_Utils_Next;
import Libreary.Login;

public class AdminLogin extends Login
{
	
	String datafile = "E:\\Qedge\\Data.Driven.testing.xlsx";
	String datasheet = "AdminLigin_validData";
	
	
	@Test
	public void adminlogin() throws IOException 
	{
	
    int rowcount =	XL_Utils_Next.getRowcount(datafile, datasheet);
		
		
    String uid,pswd;
    
		
    
    
    Login san = new Login();
    
    for( int i=1;i<=rowcount;i++)
    {
    	
    	uid =	XL_Utils_Next.getStringData(datafile, datasheet, i, 0);
    	
    	
    	
    	pswd =  XL_Utils_Next.getStringData(datafile, datasheet, i, 1);
    	
    	
      
    	san.login(uid, pswd);
    boolean res =	san.isdisplayed();
   Assert.assertTrue(res);
   
    
   if(res)
   {
	   
	  XL_Utils_Next.getsetData(datafile, datasheet, 1, 2, "pass"); 
	  XL_Utils_Next.FillGreenColour(datafile, datasheet, 1, 2);
	  
	 
   }else
   {
	  
	   XL_Utils_Next.getsetData(datafile, datasheet, 1,2, "fail");
	   XL_Utils_Next.FillRedColour(datafile, datasheet, 1, 2);
	   
	   
   }
	   
   san.logout();
    	
    }
    	
	}
	
	

}
