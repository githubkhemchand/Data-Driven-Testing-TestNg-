package sel;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Browser_width_height_in_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.housecaart.com/");
    System.out.println("Successfully navigate to above URL:");
	
    System.out.println(driver.manage().window().getSize());
    
    Dimension d = new Dimension(500,500);
  //  driver.manage().window().setSize(d);
    System.out.println(driver.manage().window().getSize());
    		
    		
	}

}
