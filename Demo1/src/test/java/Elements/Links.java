package Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demoqa.com/links");
		 
		 List<WebElement> link = driver.findElements(By.xpath("//p/a"));
		 for(int i=0;i<link.size();i++) {
			 link.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		 }
		 

	}

}
