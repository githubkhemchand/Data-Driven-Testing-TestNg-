package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_In_New_Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.housecaart.com/");
       driver.findElement(By.partialLinkText("LOGIN")).sendKeys(Keys.CONTROL+"t");
       System.out.println("Successfully open new tab");
       
	}

}
