package Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {
public static void main(String [] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demoqa.com/");
	 driver.findElement(By.linkText("Dynamic Properties")).click();
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("enableAfter"))));
	 driver.findElement(By.id("enableAfter")).click();
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("visibleAfter"))));
	 driver.findElement(By.id("visibleAfter")).click();
	
	
}
}
