package org.seleniumPractise.com;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageDemoqa {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/broken");
List<WebElement> images=driver.findElements(By.tagName("img"));
for(WebElement img:images)
{
	String imageUrl=img.getAttribute("src");
	if(imageUrl !=null && !imageUrl.isEmpty())
	{
		checkImage(imageUrl);
	}
}
driver.quit();
	}
public static void checkImage(String imageUrl)
{
	try
	{
		HttpURLConnection connection=(HttpURLConnection) URI.create(imageUrl).toURL().openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode=connection.getResponseCode();
		if(responseCode >= 400) {
		System.out.println("❌ Broken image: " + imageUrl + " - Status code: " + responseCode);
    } 
		else 
    {
        System.out.println("✅ Valid image: " + imageUrl);

	}
		} 
	catch (Exception e) {
        System.out.println("⚠️ Error checking image: " + imageUrl + " - " + e.getMessage());
    }


}
}