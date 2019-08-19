package Elements_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class App_elements {

WebDriver driver;

//login elements
By campus_apps = By.xpath("/html/body/div/section[2]/div/div[2]/div/div[3]/div[2]/a/span[1]");
By cougar_courses_btn = By.xpath("//*[@id='app-dd']/ul/li[2]/a/span");
By login_btn2 = By.xpath("//*[@id='above-header']/div/div[2]/form/button");
By login_btn1 = By.xpath("//*[@id='mr-nav']/div/a");
By username2= By.xpath("//*[@id='userNameInput']");
By username1= By.xpath("//*[@id='username']");
By password2 = By.xpath("//*[@id='passwordInput']");
By password1 = By.xpath("//*[@id='password']");
By signIn_btn2 = By.xpath("//*[@id='submitButton']");
By signIn_btn1 = By.xpath("//*[@id='snap-pm-content']/form/input[2]");
By signIn_btn3 = By.xpath("//*[@id='region-main']/div/div/div/center/form/input");

// All tabs elements
By profile_tab = By.xpath("//*[@id='snap-pm-header-quicklinks']/a[1]");
By dashBoard_tab = By.xpath("//*[@id='snap-pm-header-quicklinks']/a[2]");
By prefrence_tab = By.xpath("//*[@id='snap-pm-header-quicklinks']/a[3]");
By grades_tab = By.xpath("//*[@id='snap-pm-header-quicklinks']/a[4]");

By myCourse_btn = By.xpath("//*[@id='snap-pm-trigger']/span[1]");

//By home_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[1]/li[1]/a");
//By dashBoard_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[1]/li[2]/a");
//By previousCourse_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[2]/li[3]/a");
//By community_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[2]/li[4]/a");
//By logout_dropdown = By.xpath("//*[@id='above-header']/div/div[2]/div/a");


By logout_btn = By.xpath("//*[@id='snap-pm-logout']");
By invalid_credential = By.xpath("//*[@id='errorText']");
By course_lib_thesis = By.xpath("//*[@id='snap-pm-courses-current-cards']/div[1]/div/h3/a");

//constructor
public App_elements(WebDriver driver)
{
	this.driver=driver;	
}

public void generalFunc()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.findElement(campus_apps).click();
	js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	driver.findElement(cougar_courses_btn).click();
	driver.findElement(login_btn1).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(username1).sendKeys("sharm014");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(password1).sendKeys("Autotest@01");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(signIn_btn1).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(signIn_btn3).click();
}

public void type_usernamefunc(String uid)
{
	driver.findElement(username2).sendKeys(uid);
}

public void type_passwordfunc(String pass_word)
{
	driver.findElement(password2).sendKeys(pass_word);
}

public void click_signIn_func()
{
	driver.findElement(signIn_btn2).click();
}


public void profile_tab_func()
{
	driver.findElement(profile_tab).click();
}

public void dashboard_tab_func()
{
	driver.findElement(dashBoard_tab).click();
}

public void prefrence_tab_func()
{
	driver.findElement(prefrence_tab).click();
}

public void grades_tab_func()
{
	driver.findElement(grades_tab).click();
}

public void logout_func()
{
	//driver.findElement(logout_dropdown).click();
	driver.findElement(logout_btn).click();
}

public void lib_course_func()
{
	driver.findElement(course_lib_thesis).click();
}

public void my_courseBtn_func()
{
	driver.findElement(myCourse_btn).click();
}

public void invalid_creds_func()
{
	WebElement errorMessage= driver.findElement(By.xpath("//*[@id='errorText']"));
	Assert.assertEquals(errorMessage.getText(),"Incorrect user ID or password. Type the correct user ID and password, and try again.");
	System.out.println(errorMessage.getText());
}

}


