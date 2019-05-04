package sel;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Allcommands
{  
	public static void main(String args[]) throws InterruptedException
	{
		
    WebDriver driver =new ChromeDriver();
    String url ="https://www.housecaart.com/";
    driver.get(url);
    String text = driver.getTitle();
   /* String pagesrc = driver.getPageSource();
    String currenturl = driver.getCurrentUrl();
    System.out.println("Text :"+text);
    System.out.println("Page Source  :"+pagesrc); 
    System.out.println("Curret URL :"+currenturl);
    */
    /*
    List<WebElement> link = driver.findElements(By.tagName("a"));
    System.out.println(link.size());
    
    for(int i=1;i<=link.size();i++)
    {
    	System.out.println(link.get(i).getText());
    }*/
    
    
    /*String actualurl = driver.getCurrentUrl();
    System.out.println(actualurl);
    if(actualurl.equals(url))
    {
    	System.out.println("Verification Successfully: We Open right URL");
    }
    else
    {
    	System.out.println("Verification Fail : We openn wrong URl");
    }*/
    
    
   /* Boolean status = driver.findElement(By.id("navbarDropdownMenuLin")).isDisplayed();
    System.out.println(status);*/
    
    
    String windowhandle = driver.getWindowHandle();
    	
    System.out.println(windowhandle);
    
    Thread.sleep(5000);
    driver.close();
}
}
