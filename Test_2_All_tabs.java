package Testing_Spec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import Browser_info.Browser_class;
import Elements_methods.App_elements;
import library.Utility;
import org.openqa.selenium.JavascriptExecutor;

public class Test_2_All_tabs {

	@Test
	public void verify_all_tabs () throws Exception
	{
				
		WebDriver driver =  Browser_class.start_browser_func("chrome","https://www.csusm.edu/");
		App_elements access = new App_elements(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		access.generalFunc();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		Utility.captureScreenshots(driver, "Cougar Course");
		
		access.type_usernamefunc("myUsername");
		Utility.captureScreenshots(driver, "username");
		access.type_passwordfunc("myPassword");
		Utility.captureScreenshots(driver, "password");
		access.click_signIn_func();	
		access.profile_tab_func();
		Utility.captureScreenshots(driver, "profile_tab");
		access.my_courseBtn_func();
		access.dashboard_tab_func();
		Utility.captureScreenshots(driver, "Dashboard_tab");
		access.my_courseBtn_func();
		access.prefrence_tab_func();
		Utility.captureScreenshots(driver, "Preference_tab");
		access.my_courseBtn_func();
		access.grades_tab_func();
		Utility.captureScreenshots(driver, "grades_tab");
		access.my_courseBtn_func();
		js.executeScript("window.scrollBy(0,1000)");
		access.logout_func();
		
		driver.quit();

		
	}

	
}

