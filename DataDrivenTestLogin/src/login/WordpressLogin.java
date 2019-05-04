package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin
{
   WebDriver driver;
   
  
   
   @Test(dataProvider="wordpressata")
   public void loginwithwordpree(String username, String password) throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\Java Practice programs\\DataDrivenTestLogin\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("https://housekart.com/khemchand/wp-login.php?redirect_to=https%3A%2F%2Fhousekart.com%2Fkhemchand%2Fwp-admin%2F&reauth=1");
    
	   driver.findElement(By.id("user_login")).sendKeys("username");
       driver.findElement(By.id("user_pass")).sendKeys("password");
       driver.findElement(By.id("wp-submit")).click();
       Thread.sleep(5000);
      //System.out.println(driver.getTitle());
       Assert.assertTrue(driver.getTitle().contains("Log In"),"Something went wrong");
       
       System.out.println("Login Successfully khemya..........");
       
       
   }
  
   
   
   @AfterMethod
   public void closewindow()
   {
	   driver.close();
   }
   
   @DataProvider(name="wordpressata")
   public Object[][] passData()
   {
	   Object[][] data = new Object[2][2]; //Row and Column
	   
	   data[0][0]="mahajankhemchand@gmail.com";
	   data[0][1]="wordpress@123...@";
	   
	   data[1][0]="mahajan";
	   data[1][1]="password";
	   
	   return data;
   }
}
