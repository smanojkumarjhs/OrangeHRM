package Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClass {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demoqa.com/buttons");
		 
		 driver.findElement(By.id("rightClickBtn")).click();
		 driver.findElement(By.id("doubleClickBtn")).click();
		 driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		 
		 driver.quit();

	}

}
