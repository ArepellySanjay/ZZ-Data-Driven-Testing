package Libreary;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import App_Utils.UtilsDemo;



public class Login extends UtilsDemo
{

	public void login(String ui, String pwd)
	{
		//driver.findElement(Byid("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(ui);
		
	//	driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		
	}
	
	

	public void logout() 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
			
		
	
	
	 public boolean isdisplayed()
	 {
		if (driver.findElement(By.linkText("Admin")).isDisplayed())
		{
		 return true; 
		}
		{
			return false;
		}
	}
	
	 
	 
	 
	 
	 public boolean isErrMsgDisplayed()
	 {
		String erromsg;
		erromsg = driver.findElement(By.id("spanMessage")).getText();
		if(erromsg.toLowerCase().contains("invalid") || erromsg.toLowerCase().contains("empty"))
		{
			return true;
		}else
		{
		 return false;
		 
	 }
	 
	 
	 }
	 
	
}
