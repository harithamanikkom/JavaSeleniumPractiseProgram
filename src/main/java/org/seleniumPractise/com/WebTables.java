package org.seleniumPractise.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		//Locate and Read Table Data
		
		
		List<WebElement> rows = driver.findElements(By.cssSelector(".rt-tr-group"));//Get all rows
		
		
		//Loop through rows and print cell data
		for (WebElement row : rows) {
		    List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
		    for (WebElement cell : cells) {
		        System.out.print(cell.getText() + " | ");
		    }
		    System.out.println();
		}
		driver.findElement(By.id("edit-record-1")).click();

		// Fill in the form fields
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Haritha");

		driver.findElement(By.id("submit")).click();

		driver.findElement(By.id("delete-record-2")).click();
		
		driver.findElement(By.id("addNewRecordButton")).click();

		driver.findElement(By.id("firstName")).sendKeys("Riya");
		driver.findElement(By.id("lastName")).sendKeys("Sharma");
		driver.findElement(By.id("userEmail")).sendKeys("riya@example.com");
		driver.findElement(By.id("age")).sendKeys("28");
		driver.findElement(By.id("salary")).sendKeys("50000");
		driver.findElement(By.id("department")).sendKeys("HR");

		driver.findElement(By.id("submit")).click();
	}

}
