package Testing_Spec_CSUSM_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Browser_info.Browser_class;
import Page_Object_design.CSUSM_Webpage;
import library.Utility;


public class Test_6_CSUSM_Webpage_Class_Schedule extends BaseClass_extentReport {
	
	@Test
	public void verify_CSUSM_Class_Schedule () throws Exception
	{

	// creates a toggle for the given test, adds all log events under it    
			test = extent.createTest("Test_6_CSUSM_Webpage_Class_Schedule", "Verify the class schedule page");
			// log(Status, details)
			test.log(Status.INFO, "Start the browser and go to csusm.edu");

			WebDriver driver =  Browser_class.start_browser_func("chrome","https://www.csusm.edu/");
			CSUSM_Webpage verify = new CSUSM_Webpage(driver);
			test.pass("navigated to the csusm.edu");

			//Verify the web page heading, title and print it
			WebElement webpage_heading= driver.findElement(By.xpath("//*[@id='ga-hp-header-home']"));
			System.out.println(webpage_heading.getText());
			String page_title = driver.getTitle();
			System.out.println(page_title);
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "CSUSM Home page_1");
			test.pass("navigated to the csusm.edu Home page");
			
			//Scroll the web page down and take the screen shot	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "CSUSM Home page_2");

			//go to Academics > Class Schedule
			verify.academics_tab_func();	
			test.pass("navigated to the Academics tab");
			verify.class_schedule_func();
			test.pass("navigated to the class schedule tab");
			String class_schedule_page_title = driver.getTitle();
			WebElement webpage_heading1= driver.findElement(By.xpath("//*[@id='maincontent']/div/h1"));
			System.out.println(webpage_heading1.getText());
			System.out.println(class_schedule_page_title);
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "Class Schedule page");
			
			//Click Browse/Search courses button
			verify.browse_search_course_func();
			test.pass("clicked the browse/search button");
			String schedule_classes_page_title = driver.getTitle();
			WebElement webpage_heading2= driver.findElement(By.xpath("//*[@id='DERIVED_CLSRCH_SS_TRANSACT_TITLE']"));
			System.out.println(webpage_heading2.getText());
			System.out.println(schedule_classes_page_title);
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "View schedule of classes page");
			
			//Search subject
			verify.subject_dd_func();
			verify.subject_dd_sendkeys_func("Computer Science");
			
			//enter in course career drop down
			verify.course_career_dd_func();
			verify.course_career_dd_sendkeys_func("postbaccalaureate");
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "Entered subject and course career drop down");
			
			//click search button
			verify.search_button_func();
			Thread.sleep(5000);
			test.pass("clicked on search button successfuly");
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "Class Schedule details");
						
			//Scroll the web page down and take the screen shot	
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,document.body.scrollHeight);");
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "Class Schedule details whole page");
			
			//click modify search button and search again
			verify.modify_search_button_func();
			test.pass("clicked on modify search button successfuly");
			Thread.sleep(2000);
			verify.clear_search_button_func();
			test.pass("clicked on clear button successfuly");
			Thread.sleep(2000);
			verify.subject_dd_func();
			verify.subject_dd_sendkeys_func("Business Administration - MBA");
			verify.course_career_dd_func();
			verify.course_career_dd_sendkeys_func("postbaccalaureate");
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "Entered modified search options in drop down");
			
			//click search button
			verify.search_button_func();
			Thread.sleep(5000);
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "Modified Class Schedule details");
						
			//Scroll the web page down and take the screen shot	
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,document.body.scrollHeight);");
			Utility.captureScreenshots_CSUSM_webpage_test6(driver, "Modified Class Schedule details whole page");
			
			
			driver.quit();
	}
}
