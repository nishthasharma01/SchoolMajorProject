package Testing_Spec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Browser_info.Browser_class;
import Elements_methods.App_elements;
import library.Utility;

public class Test_4_CSUSM_webPage {

	@Test
	public void verify_CSUSM_webPage () throws Exception
	{
		
		//Browser_class browser = new Browser_class();
		
		
		WebDriver driver =  Browser_class.start_browser_func("chrome","your websit url");
		App_elements verify = new App_elements(driver);
		
		WebElement webpage_heading= driver.findElement(By.xpath("//*[@id='ga-hp-header-home']"));
		System.out.println(webpage_heading.getText());
		String page_title = driver.getTitle();
		System.out.println(page_title);
		Utility.captureScreenshots(driver, "CSUSM main page");
		
		//go to Academics > Course Catalog
		verify.academics_tab_func();	
		verify.course_catalog_func();
		String course_catalog_page_title = driver.getTitle();
		WebElement webpage_heading1= driver.findElement(By.xpath("//*[@id='acalog-page-title']"));
		System.out.println(webpage_heading1.getText());
		System.out.println(course_catalog_page_title);
		Utility.captureScreenshots(driver, "Course Catalog page");
		
		driver.quit();
	}
}
