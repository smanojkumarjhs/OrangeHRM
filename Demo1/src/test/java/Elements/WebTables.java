package Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demoqa.com/webtables");
		 
		 driver.findElement(By.xpath("//button[text()='Add']")).click();
		 //driver.switchTo().frame(1);
		 driver.findElement(By.id("firstName")).sendKeys("mkk");
		 driver.findElement(By.id("lastName")).sendKeys("mkmkm");
		 driver.findElement(By.id("userEmail")).sendKeys("mk@gmail.com");
		 driver.findElement(By.id("age")).sendKeys("25");
		 driver.findElement(By.id("salary")).sendKeys("2000");
		 driver.findElement(By.id("department")).sendKeys("qa");
		 driver.findElement(By.id("submit")).click();
		 

	}

}
