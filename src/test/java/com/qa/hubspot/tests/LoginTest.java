package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hubspot.Base.BasePage;
import com.qa.hubspot.Pages.LoginPage;
import com.qa.hubspots.constants.Constants;

public class LoginTest {

public BasePage basePage;

public WebDriver driver;
	public Properties prop;
	
	public LoginPage loginPage;
	
	//test case 1:
	//pre condition:open browser,url
	//test steps - test case : login test --un/pwd/loginbtn
	//validations-ac/exp
	//post step : close the browser
	
	
	
	
	
	
@BeforeMethod
	
	public void setup() {
		
		basePage = new BasePage();
		 prop =   basePage.initialize_Properties();
         driver  =basePage.initialize_driver();
         
        driver.get(prop.getProperty("url"));
        
        loginPage = new LoginPage(driver);
        }


@Test(priority = 1)

public void verifyLoginPageTitleTest() {
	
String title =  loginPage.getLoginPageTitle();

System.out.println("the login page title is:" +title);


Assert.assertEquals(title,"https://app.hubspot.com/login");


}
@Test(priority = 2)
public void verifysignUpLink() {
	
	Assert.assertTrue(loginPage.VerifySignUpLink());
}
    
  
   @Test(priority = 2)
   public void login (String un, String pwd) {

 loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		

	}
   
   @AfterMethod()
   
   public void tearDown() {
	   
	   driver.quit();
	   
   }
 
	
	
	
	}
	
	

