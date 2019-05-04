package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Panel {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
          WebDriver driver= new ChromeDriver();
          driver.get("https://housecaart.org");
          driver.switchTo().frame("navbar navbar-expand-lg  fixed-top bg-default");
          
          driver.findElement(By.linkText("About Us")).click();
          String Title= driver.getTitle();
          System.out.println(Title);
          
	}

}
