package sel;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Web_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.guru99.com/software-testing-seven-principles.html");
     
     List<WebElement> element =  driver.findElements(By.xpath("//*"));
     System.out.println(Integer.toString(element.size()));
     for(WebElement el: element)
     {
    	 System.out.println(el.getTagName()+ ":"+el.getText());
     }

  }
}