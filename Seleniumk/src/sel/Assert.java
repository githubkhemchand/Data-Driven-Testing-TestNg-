package sel;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.housecaart.com/");
		
		//JavascriptException j = (JavascriptException) driver;
		String title = driver.getTitle();
		System.out.println("Page Title :"+title);
		
		//Assert.assertTrue(title.contains("google"));
	}

}
