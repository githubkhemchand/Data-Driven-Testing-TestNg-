package sel;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.housecaart.com/");
     
     Capabilities cap = ((RemoteWebDriver)driver).getCapabilities();
     
     String BrowserName = cap.getBrowserName();
     String version = cap.getVersion();
     int a= cap.hashCode();
     System.out.println("Browsr name:"+BrowserName+ ",Version:"+version+",Hash Code"+a);
	}

}
