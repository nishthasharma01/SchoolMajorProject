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
		
		access.type_usernamefunc("sharm014");
		Utility.captureScreenshots(driver, "username");
		access.type_passwordfunc("Autotest@01");
		Utility.captureScreenshots(driver, "password");
		access.click_signIn_func();	
		access.home_tab_func();
		Utility.captureScreenshots(driver, "Home_tab");
		access.dashboard_tab_func();;
		Utility.captureScreenshots(driver, "Dashboard_tab");
		access.previousCourse_tab_func();;
		Utility.captureScreenshots(driver, "PreviousCourse_tab");
		access.community_tab_func();;
		Utility.captureScreenshots(driver, "Community_tab");
		js.executeScript("window.scrollBy(0,1000)");
		
		
		driver.quit();

		
	}

	
}
