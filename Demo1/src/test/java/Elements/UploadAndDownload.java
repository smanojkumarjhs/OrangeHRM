package Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownload {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demoqa.com/");
		 driver.findElement(By.linkText("Upload and Download")).click();
		 
		 driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Qapitol QA\\Downloads\\image.jpeg");

	}

}
