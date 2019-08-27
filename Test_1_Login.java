package Testing_Spec;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Browser_info.Browser_class;
//import App_ements.web_driver;
import Elements_methods.App_elements;
import library.Utility;

import org.apache.commons.io.FileUtils;

public class Test_1_Login {

	@Test
	public void verify_login () throws Exception
	{
		
		//Browser_class browser = new Browser_class();
		
		
		WebDriver driver =  Browser_class.start_browser_func("chrome","https://www.csusm.edu/");
		App_elements login = new App_elements(driver);

		login.generalFunc();
		Utility.captureScreenshots(driver, "Cougar Course");
		login.type_usernamefunc("myUsername");
		Utility.captureScreenshots(driver, "username");
		login.type_passwordfunc("MyPassword");
		Utility.captureScreenshots(driver, "password");
		login.click_signIn_func();
		//Assert.assertEquals(login.invalid_creds_func(), "Incorrect user ID or password. Type the correct user ID and password, and try again.");
		login.invalid_creds_func();
//		login.click_course_func();
//		Utility.captureScreenshots(driver, "homepage");
//		login.logout_func();
		Thread.sleep(2000);
		driver.quit();

		
	}
	
	
			
	
	
}
