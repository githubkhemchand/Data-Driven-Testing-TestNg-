package sel;


import java.util.List;import java.util.List.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_All_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=beNmCxpjhJA");
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        int url=1;
        for(WebElement el:links)
        {  
        	System.out.println(el.getAttribute("href"));
        	url++;
        }
        System.out.println(+url);
	}

}
