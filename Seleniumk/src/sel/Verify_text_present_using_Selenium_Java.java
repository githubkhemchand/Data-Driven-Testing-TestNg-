package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_text_present_using_Selenium_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.guru99.com/software-testing-seven-principles.html");
       
       if(driver.getPageSource().contains("Folder B is on a shared drive and storage capacity is full."))
       {
    	   System.out.println("Page contaise is available");
       }else
       {
    	   System.out.println("Page Containse is not available");
       }
	}

}
