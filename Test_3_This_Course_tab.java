package Testing_Spec;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Browser_info.Browser_class;
import Elements_methods.App_elements;
import library.Utility;

public class Test_3_This_Course_tab {

	@Test
	public void verify_this_course_tab () throws Exception
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
		access.univ_course_func();
		
		driver.quit();

		
	}

	
}
