package sel;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Domain_name {

	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.pskills.org/htmlinterview1.jsp?sno=38");
    
    URI uri = new URI(driver.getCurrentUrl());
    String domain  = uri.getHost();
    System.out.println(domain);
	}

}
