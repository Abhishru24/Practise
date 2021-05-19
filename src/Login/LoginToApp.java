package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToApp {

	public static void main(String[] args) {
				
		
				System.setProperty("webdriver.gecko.driver","A:\\Eclipse\\Selenium Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				
				driver.get("http://www.demo.guru99.com/V4/"); // enter URL
				String expTitle = driver.getTitle();
				String actTitle = "Guru99 Bank Home Page";
				System.out.println(expTitle);
				System.out.println(actTitle);
				if(expTitle.equalsIgnoreCase(actTitle)) {
					
					WebElement Username = driver.findElement(By.name("uid"));
					if(Username.isDisplayed())
						Username.clear();
						Username.sendKeys("mngr320737");
					
					WebElement Password = driver.findElement(By.name("password"));
					if(Password.isDisplayed())
						Password.clear();
						Password.sendKeys("sepetYg");
						
						
					WebElement BtnLogin = driver.findElement(By.name("btnLogin"));
					if(BtnLogin.isDisplayed() && BtnLogin.isEnabled()){
						BtnLogin.click();
					}
				}
				
//				driver.close();
					
				
								//mngr320737
				//sepetYg
		


	}

}
