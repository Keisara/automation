package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	private static WebElement element = null;

	public static WebElement SignIn(WebDriver driver){
		element = driver.findElement(By.className("mr-2"));
		return element;
	}
	public static WebElement LogOut1(WebDriver driver){
        element = driver.findElement(By.className("avatar"));
        return element;
        }
    public static WebElement LogOut2(WebDriver driver){
        element = driver.findElement(By.className("dropdown-signout"));
        return element;
        }
}