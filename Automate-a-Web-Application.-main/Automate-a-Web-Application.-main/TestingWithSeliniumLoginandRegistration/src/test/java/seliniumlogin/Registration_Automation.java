package seliniumlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Registration_Automation {
	
    public static void main(String[] args)
    {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\reliance\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://amazon.in/ap/signin?openid.pape.max_auth_age=0&openid return to=https://www.amazon.in/?ref_=nav_ya_signin&openid.identity=http:/..._physical_ms%3D1007765%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIgKXQyLa3-gIVRSUrCh0rwQpyEAAYASAAEgI41vD_BwE");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.name("yourname"))
        .sendKeys("ABCDEF");
        
      
        driver.findElement(By.name("reg_email__"))
            .sendKeys("ABCDEF@gmail.com");
        
        driver.findElement(By.name("reg_email_confirmation__"))
        .sendKeys("ABCDEF@gmail.com");
        
        driver.findElement(By.id("password_step_input"))
        .sendKeys("Bharath!2");
        
        
        driver.findElement(By.className("_8esa"))
        .click();
  
        driver.findElement(By.name("websubmit"))
            .click();
    }
}
