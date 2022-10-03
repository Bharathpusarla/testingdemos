package seliniumlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Automation {
	 public static void main(String[] args)
	    {
	        System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\reliance\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://amazon.in/ap/signin?openid.pape.max_auth_age=0&openid return to=https://www.amazon.in/?ref_=nav_ya_signin&openid.identity=http:/1MX0%3D");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("email"))
	        .sendKeys("ABCDEF@gmail.com");
	        
	        driver.findElement(By.id("pass"))
	        .sendKeys("bharath!2");
	        
	        driver.findElement(By.id("loginbutton"))
            .click();
	        
	    }
}
