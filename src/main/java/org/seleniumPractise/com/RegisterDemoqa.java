package org.seleniumPractise.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterDemoqa {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
/*driver.get("https://demoqa.com/checkbox");
driver.manage().window().maximize();
//driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement checkboxIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
    By.cssSelector(".rct-icon.rct-icon-uncheck")));
checkboxIcon.click();*/




        
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        // Click "Yes" radio button
        WebElement yesRadio = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        yesRadio.click();

        // Click "Impressive" radio button
        WebElement impressiveRadio = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        impressiveRadio.click();

        // "No" radio button is disabled, so clicking it will throw an error
        WebElement noRadio = driver.findElement(By.cssSelector("input[id='noRadio']"));
        boolean isEnabled = noRadio.isEnabled();
        System.out.println("Is 'No' radio button enabled? " + isEnabled);

        driver.quit();
    }
}




	


