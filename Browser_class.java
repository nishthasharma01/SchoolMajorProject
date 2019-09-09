package Browser_info;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_class {

	
	static WebDriver driver;
	
	public static WebDriver start_browser_func(String browser_name, String url)
	{
	
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			String exePath = "C:\\Installed programs selenium groovy\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		}
		
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			
			String exePath = "C:\\Installed programs selenium groovy\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exePath);
			driver = new FirefoxDriver();
			
		}
		
		else if(browser_name.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Installed programs selenium groovy\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
				
		
		driver.manage().window().maximize();
		driver.get(url);
				
		return driver;
	}
	
}
