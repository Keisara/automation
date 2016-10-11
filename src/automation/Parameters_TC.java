package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

public class Parameters_TC {
private static WebDriver driver = null;
	public static void main(String[] args) {	
		SignIn(driver, Constants.Username,Constants.Password, Constants.UsernameFail);
	}
		
	public static void SignIn(WebDriver driver, String Username, String Password, String UsernameFail){
		//Maximizes the Chrome web browser then launches the github website. 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		
		/* A for loop that tests each of the 4 cases. An expected result will yield PASS
		 * and unexpected result will yield FAIL. The goal is for all cases to PASS.
		 */
		
		for (int i = 0; i < Constants.usernameArray.length; i++){
			// Try to login successfully
			try{
				Home_Page.SignIn(driver).click();
				LogIn_Page.txtbx_UserName(driver).sendKeys(Constants.usernameArray[i]);
				LogIn_Page.txtbx_Password(driver).sendKeys(Constants.passwordArray[i]);
				LogIn_Page.btn_LogIn(driver).click();
				//Check for an element that should only exist upon successful login
				if (LogIn_Page.LogIn_Check(driver).isDisplayed() && i == 0){
					// A Successful login will pass if it is Case 1
					System.out.println(Constants.caseArray[i] + " | PASS");
					Home_Page.LogOut1(driver).click();
					Home_Page.LogOut2(driver).click();
				}
				else
					// A Successful login will fail if it is not Case 1
					System.out.println(Constants.caseArray[i] + " | FAIL");
			}
			// Do when login fails
			catch (Exception e){
				//Implicitly waits 10 seconds
				// A Failed login will pass if it is Case 2, 3, or 4
				if (i > 0 && i <= Constants.usernameArray.length)
					System.out.println(Constants.caseArray[i] + " | PASS");
				// A Failed login will fail if it is Case 1
				else if (i == 0)
					System.out.println(Constants.caseArray[i] + " | FAIL");
				// Reload the site until the last case is reached 
				if (i < Constants.caseArray.length - 1)
					driver.get(Constants.URL);
			}
		}
		// Close the driver
		driver.quit();
	}
}
