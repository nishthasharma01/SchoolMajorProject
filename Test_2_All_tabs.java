package Testing_Spec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Browser_info.Browser_class;
import Elements_methods.App_elements;
import library.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

public class Test_2_All_tabs {

	@Test
	public void verify_all_tabs () throws Exception
	{
				
		WebDriver driver =  Browser_class.start_browser_func("chrome","your website url");
		App_elements access = new App_elements(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Login into application
		access.generalFunc();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		Utility.captureScreenshots(driver, "Cougar Course");
		
		access.type_usernamefunc("myUsername");
		Utility.captureScreenshots(driver, "username");
		access.type_passwordfunc("MyPassword");
		Utility.captureScreenshots(driver, "password");
		access.click_signIn_func();	
		String page_title = driver.getTitle();
		System.out.println(page_title);
		
		//profile tab
		access.profile_tab_func();
		Utility.captureScreenshots(driver, "profile_tab");
		String profile_page_title = driver.getTitle();
		System.out.println(profile_page_title);
		access.my_courseBtn_func();
		
		//Dashboard tab
		Thread.sleep(2000);
		access.dashboard_tab_func();
		Utility.captureScreenshots(driver, "Dashboard_tab");
		String dashboard_page_title = driver.getTitle();
		System.out.println(dashboard_page_title);
		Thread.sleep(2000);
		access.my_courseBtn_func();
		
		//Preference tab
		Thread.sleep(2000);
		access.prefrence_tab_func();
		Utility.captureScreenshots(driver, "Preference_tab");
		String prefrence_page_title = driver.getTitle();
		System.out.println(prefrence_page_title);
		Thread.sleep(2000);
		access.my_courseBtn_func();
		
		//Grades tab
		Thread.sleep(2000);
		access.grades_tab_func();
		Utility.captureScreenshots(driver, "grades_tab");
		String grade_page_title = driver.getTitle();
		System.out.println(grade_page_title);
		Thread.sleep(2000);
		access.my_courseBtn_func();
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		access.logout_func();
		
		driver.quit();

	}

	
}
