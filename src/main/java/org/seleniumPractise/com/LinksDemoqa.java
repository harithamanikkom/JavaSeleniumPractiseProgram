package org.seleniumPractise.com;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksDemoqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		WebElement homeLink = driver.findElement(By.id("simpleLink"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", homeLink);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", homeLink);
	
		        // Switch to new tab
		        String originalWindow = driver.getWindowHandle();
		        Set<String> allWindows = driver.getWindowHandles();
		        for (String window : allWindows) {
		            if (!window.equals(originalWindow)) {
		                driver.switchTo().window(window);
		                System.out.println("New tab title: " +driver.getTitle());
		                driver.close(); // Close new tab
		            }
		        }
		        driver.switchTo().window(originalWindow); // Back to original tab

		       // 2. Click "Created" link and verify response
		        WebElement createdLink = driver.findElement(By.id("created"));
		        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createdLink);
		        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", createdLink);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(By.id("created"))).click();
		      
		        WebElement response = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		        System.out.println("Created response: " + response.getText());

		        // 3. Click other API links and print responses
		        String[] linkIds = {
		            "no-content", "moved", "bad-request", "unauthorized", "forbidden", "invalid-url"
		        };

		        for (String id : linkIds) {
		            WebElement link = driver.findElement(By.id(id));
		            link.click();
		            WebElement apiResponse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkResponse")));
		            System.out.println(id + " response: " + apiResponse.getText());
		        }

		    }
		


	

}
