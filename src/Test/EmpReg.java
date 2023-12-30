package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import App_Utils.XL_Utils_Next;
import Libreary.AdminUtils;
import Libreary.EmpRegistration;
import junit.framework.Assert;

public class EmpReg extends AdminUtils
{

	
	String datafile ="E:\\Qedge\\Data.Driven.testing.xlsx";
	String datasheet = "EmoployeReg";
	
	
	
	@Test
	public void checkEmployeeReg() throws IOException 
	{
		
		
    int	rowcount =	XL_Utils_Next.getRowcount(datafile, datasheet);
		
		EmpRegistration sun = new EmpRegistration();
		
         for(int i=1;i<rowcount;i++)
         {
        	 
        String firstname =	 XL_Utils_Next.getStringData(datafile, datasheet, i, 0);
        String Lastname =	 XL_Utils_Next.getStringData(datafile, datasheet, i, 1);
        
        
                 boolean res = sun.addemployee(firstname, Lastname);
        
               Assert.assertTrue(res);
               if(res)
               {
            	   
            	   XL_Utils_Next.getsetData(datafile, datasheet, i, 2, "pass");
            	   XL_Utils_Next.FillGreenColour(datafile, datasheet, i, 2);
               }else
               {
            	   
            	   XL_Utils_Next.getsetData(datafile, datasheet, i, 2, "");
            	   XL_Utils_Next.FillGreenColour(datafile, datasheet, i, 2);  
            	   
               }
        
        	 
         }
    
    
		
		
	}
	
	
	
	
	
	
}
