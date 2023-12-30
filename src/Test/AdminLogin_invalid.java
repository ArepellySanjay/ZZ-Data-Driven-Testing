package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import App_Utils.UtilsDemo;
import App_Utils.XL_Utils_Next;
import Libreary.Login;

public class AdminLogin_invalid extends Login
{

	 
	String datafile ="E:\\Qedge\\Data.Driven.testing.xlsx";	
	String datasheet ="AdminLogin_InvalidData";
	
	
	
	@Test
	public void Checkadminlogin_withinvalidData() throws IOException 
	{
		
		
	int rowcount =	XL_Utils_Next.getRowcount(datafile, datasheet);
		
		
	
	   Login san = new Login();
	   
	
	   String ui,pwd;
	   
	   for(int i=1;i<rowcount;i++)
	   {
		   
		   
		 ui =   XL_Utils_Next.getStringData(datafile, datasheet, i, 0);
        pwd =  XL_Utils_Next.getStringData(datafile, datasheet, i, 1);
		
		
		
		san.login(ui, pwd);
	    boolean res = san.isErrMsgDisplayed();

		if(res)
		{
			
			XL_Utils_Next.getsetData(datafile, datasheet, i, 2, "pass");
			XL_Utils_Next.FillGreenColour(datafile, datasheet, i, 2);
			
		}else
		{
			XL_Utils_Next.getsetData(datafile, datasheet, i, 2, "fail");
			XL_Utils_Next.FillRedColour(datafile, datasheet, i, 2);
			
		}
		
		
		   
	   }
		   
		   
		   
	
		
		
	}
	
	
	
	
}
