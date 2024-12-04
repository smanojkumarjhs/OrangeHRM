package Elements;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		    
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demoqa.com/broken");
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 for(WebElement hyperlink:allLinks) {
			 
			String url = hyperlink.getAttribute("href");
			try {
				
				URL actualurl = new URL(url);
				
			}
		 }
		 

	}

}
