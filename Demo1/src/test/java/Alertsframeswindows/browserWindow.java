package Alertsframeswindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/browser-windows");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// driver.findElement(By.xpath("//div[contains(text(),'Alerts, Frame &
		// Windows')]")).click();
		driver.findElement(By.id("tabButton")).click();
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		Set<String> allid = driver.getWindowHandles();
		allid.remove(parent);
		for (String id : allid) {
			driver.switchTo().window(id);

		}
		driver.switchTo().parentFrame();
		driver.findElement(By.id("messageWindowButton")).click();
		driver.switchTo().parentFrame();
		
	}

}
