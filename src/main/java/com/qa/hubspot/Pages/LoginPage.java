package com.qa.hubspot.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hubspot.Base.BasePage;



public class LoginPage extends BasePage {
	

	
// Page objects : using page factory pattern	
	
@FindBy(id= "username")

WebElement emailId;

@FindBy(id = "password")

WebElement passowrd;

@FindBy(id = "loginBtn")

WebElement loginButton;

@FindBy(linkText= "Sign up")
	
WebElement signupLink;



public  LoginPage( WebDriver driver ) {

 this.driver = driver;

PageFactory.initElements(driver, this);

}

public  String  getLoginPageTitle() {
	
 return  driver.getTitle();
	
}

public boolean  VerifySignUpLink() {
	
	 return signupLink.isDisplayed();
	
}

public void  login(String un, String pwd) {

	
	
	emailId.sendKeys(un);
	passowrd.sendKeys(pwd);
	loginButton.click();
	
  
}

}


