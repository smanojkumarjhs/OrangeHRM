package Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox{

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demoqa.com/text-box");
		 driver.findElement(By.id("userName")).sendKeys("manoj");
	     driver.findElement(By.id("userEmail")).sendKeys("mk@gmail.com");
	     driver.findElement(By.id("currentAddress")).sendKeys("jhansi me aapka swagat he");
	     driver.findElement(By.id("permanentAddress")).sendKeys("jhansi me aapka swagat he");
	   for(;;) { 
	     try{
	    	 driver.findElement(By.id("submit")).click();
	    	 break;
	     }
	     catch(Exception e){
	    	 JavascriptExecutor js = (JavascriptExecutor)driver;
	    	 js.executeScript("window.scrollBy(0,100)");
	    	 
	     }
	    		 

	   }
	   driver.quit();
	}

}
