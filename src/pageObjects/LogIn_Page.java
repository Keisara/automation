package pageObjects;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
public class LogIn_Page {
	private static WebElement element = null;
 
    public static WebElement txtbx_UserName(WebDriver driver){
         element = driver.findElement(By.id("login_field"));
         return element;
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
         element = driver.findElement(By.id("password"));
         return element;
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
         element = driver.findElement(By.name("commit"));
         return element;
         }
     public static WebElement LogIn_Check(WebDriver driver){
         element = driver.findElement(By.id("your-repos-filter"));
         return element;
         }
     
}
