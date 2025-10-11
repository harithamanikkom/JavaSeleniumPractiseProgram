package org.seleniumPractise.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
		//set page load Timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//wait for the Button to be clickable
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		try
		{
			
		WebElement enableAfterButton=wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
		
		System.out.println("Enable After button is clickable.");
		enableAfterButton.click();
		
		// Wait for color change
		WebElement colorChangeButton=driver.findElement(By.id("colorChange"));
		String initialColor=colorChangeButton.getCssValue("color");
		
		wait.until(driver1 -> {
		    String newColor = colorChangeButton.getCssValue("color");
		    return !newColor.equals(initialColor);
		    
		    
		    /*
		     * wait.until(...): Waits until the condition inside the lambda returns true.

driver1 -> {...}: A lambda expression that receives the WebDriver instance.

colorChangeButton.getCssValue("color"): Fetches the current color of the button.

!newColor.equals(initialColor): Returns true when the color has changed.

🔧 Best Practices
		     * 
		     * */
		});
		System.out.println("Color changed!");

        // Wait for visible After Button to appear
        WebElement visibleAfterButton = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter"))
        );
        System.out.println("Visible button text: " + visibleAfterButton.getText());
	}catch(Exception e)
		{
		System.out.println("Test failed due to: " + e.getMessage());
		}
		finally {
        driver.quit();
    }
}
}

	


