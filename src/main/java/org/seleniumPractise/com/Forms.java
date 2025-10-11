package org.seleniumPractise.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forms {


	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.id("firstName")).sendKeys("Haritha");
		driver.findElement(By.id("lastName")).sendKeys("Manikkom");
		driver.findElement(By.id("userEmail")).sendKeys("harithe2344@gmail.com");
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='gender-radio-2']")));

		button.click();

		driver.findElement(By.id("userNumber")).sendKeys("67453536563");

		WebElement dateofbirth = driver.findElement(By.id("dateOfBirthInput"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateofbirth);
		dateofbirth.click();

		// select year

		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByValue("1989");

		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("October");

		WebElement day = driver
				.findElement(By.xpath("//div[contains(@class,'react-datepicker__day') and text()='31']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", day);
		day.click();

		WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
		subjectsInput.sendKeys("Maths");
		subjectsInput.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		subjectsInput.sendKeys("English");
		subjectsInput.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		subjectsInput.sendKeys("Hindi");
		subjectsInput.sendKeys(Keys.ENTER);
		((JavascriptExecutor) driver).executeScript("arguments[0].blur();", subjectsInput);

		WebElement hobbies = driver.findElement(By.xpath("//label[text()='Sports']"));
		hobbies.click();

		WebElement uploadpicture = driver.findElement(By.id("uploadPicture"));
		uploadpicture.sendKeys("C:\\Users\\HARITHA\\Pictures\\Saved Pictures\\Kichu.png");
		System.out.println("Picture uploaded successfully.");

		driver.findElement(By.id("currentAddress")).sendKeys("Kapil Society,Ambenath, Nashik");
Thread.sleep(3000);



 driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
 driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
 Thread.sleep(3000);
 
 driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
 driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
 Thread.sleep(3000);
 
 driver.findElement(By.id("submit")).click();
 Thread.sleep(3000);
 
 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(src, new File("C:\\Screenshots\\screenshot.png"));
 driver.quit();

		
	}
	
}
