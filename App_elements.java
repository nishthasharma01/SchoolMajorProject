package Elements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class App_elements {

WebDriver driver;

By campus_apps = By.xpath("/html/body/div/section[2]/div/div[2]/div/div[3]/div[2]/a/span[1]");
By cougar_courses_btn = By.xpath("//*[@id='app-dd']/ul/li[2]/a/span");
By login_btn = By.xpath("//*[@id='above-header']/div/div[2]/form/button");
By username= By.xpath("//*[@id='userNameInput']");
By password = By.xpath("//*[@id='passwordInput']");
By signIn_btn = By.xpath("//*[@id='submitButton']");
By lib_thesis_course = By.xpath("//*[@id='course-info-container-17399']/div/div[2]/h4/a");
By home_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[1]/li[1]/a");
By dashBoard_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[1]/li[2]/a");
By previousCourse_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[2]/li[3]/a");
By community_tab = By.xpath("//*[@id='navwrap']/div/div/nav/div/div/ul[2]/li[4]/a");
By logout_dropdown = By.xpath("//*[@id='above-header']/div/div[2]/div/a");
By logout_btn = By.xpath("//*[@id='above-header']/div/div[2]/div/ul/li[7]/a");
By invalid_credential = By.xpath("//*[@id='errorText']");

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
	driver.findElement(login_btn).click();
}

public void type_usernamefunc(String uid)
{
	driver.findElement(username).sendKeys(uid);
}

public void type_passwordfunc(String pass_word)
{
	driver.findElement(password).sendKeys(pass_word);
}

public void click_signIn_func()
{
	driver.findElement(signIn_btn).click();
}

public void click_course_func()
{
	driver.findElement(lib_thesis_course).click();
}

public void home_tab_func()
{
	driver.findElement(home_tab).click();
}

public void dashboard_tab_func()
{
	driver.findElement(dashBoard_tab).click();
}

public void previousCourse_tab_func()
{
	driver.findElement(previousCourse_tab).click();
}

public void community_tab_func()
{
	driver.findElement(community_tab).click();
}

public void logout_func()
{
	driver.findElement(logout_dropdown).click();
	driver.findElement(logout_btn).click();
}

public void invalid_creds_func()
{
	WebElement errorMessage= driver.findElement(By.xpath("//*[@id='errorText']"));
	Assert.assertEquals(errorMessage.getText(),"Incorrect user ID or password. Type the correct user ID and password, and try again.");
	System.out.println(errorMessage.getText());
}

}

