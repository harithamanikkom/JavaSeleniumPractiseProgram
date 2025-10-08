package org.seleniumPractise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsDemoqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		
		//Double click
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		Actions actions =new Actions(driver);
		actions.doubleClick(doubleclick).perform();
		Thread.sleep(3000);
		
		//Right click
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightclick).perform();
		Thread.sleep(3000);
		
		//simple click
		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
	actions.click(click).perform();
	Thread.sleep(3000);
	driver.quit();
	

	}

}
