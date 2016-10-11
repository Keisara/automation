package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {
	 
	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		
        //Launch the Online Store Website
		driver.get("https://github.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website https://github.comm");
 
		//Wait for 5 Sec
		Thread.sleep(5);
		
        // Close the driver
        //driver.quit();
    }
}