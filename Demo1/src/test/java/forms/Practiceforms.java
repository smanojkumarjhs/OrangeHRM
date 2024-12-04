package forms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiceforms {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("firstName")).sendKeys("mk");
		driver.findElement(By.id("lastName")).sendKeys("kk");
		driver.findElement(By.id("userEmail")).sendKeys("smk@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8989898989");
		for (;;) {
			try {
				driver.findElement(By.id("dateOfBirthInput")).click();
				Select yearselect = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
				yearselect.selectByValue("1998");
				Select monthSelect = new Select(
						driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
				monthSelect.selectByIndex(9);
				driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, October 18th, 1998']")).click();

				break;
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,100)");
			}

		}

		WebElement subject = driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("maths");
		subject.sendKeys(Keys.ENTER);

		js.executeScript("window.scrollBy(0,150)");

		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		WebElement uploadPopUp = driver.findElement(By.xpath("//input[@id='uploadPicture' and @type='file']"));

		uploadPopUp.sendKeys("C:\\Users\\Qapitol QA\\Downloads\\image.jpeg");
		driver.findElement(By.id("currentAddress")).sendKeys("asklakdlkd");

		Select selectState = new Select(driver.findElement(By.id("state")));
		selectState.selectByIndex(2);
		Select selectCity = new Select(driver.findElement(By.id("city")));
		selectCity.selectByIndex(3);
		driver.findElement(By.id("submit")).click();

	}

}
