package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseropen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.housecaart.com/");
        
        String expectedtitle ="Online Real Estate Directory - Properties Services Providers Product Suppliers"; 
        String actualtitle= driver.getTitle();
        
        
        System.out.println("page title= "+actualtitle);
        
	        if(actualtitle.contentEquals(expectedtitle))
	        {
	        	System.out.println("Test Pass");
	        }else
	        {
	        	System.out.println("test Fail");
	        }
	
	 String pageSource = driver.getPageSource();
	 System.out.println("Current page Source is: "+pageSource);
	}
     
}
