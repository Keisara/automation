package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

public class POM_TC {
private static WebDriver driver = null;
	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://github.com/login");
	// Use page Object library now
	//Home_Page.lnk_MyAccount(driver).click();
	
	try{
		LogIn_Page.txtbx_UserName(driver).sendKeys("Kesakyu@gmail.com");
		LogIn_Page.txtbx_Password(driver).sendKeys("decaskate8");
		LogIn_Page.btn_LogIn(driver).click();
		if (driver.findElement(By.id("your-repos-filter")).isDisplayed())
			System.out.println("Login Successful");
	}
	catch (Exception e){
		System.out.println("Login Failed");
	}

	//if (driver.findElement(By.id("your-repos-filter")).isDisplayed())
	//	System.out.println("Login Successful");
	//else
	//	System.out.println("Login Failed");

	//Home_Page.lnk_LogOut(driver).click(); 
	//driver.quit();
	}
	public static class LogInFailedException extends Exception{
		
	}
}
