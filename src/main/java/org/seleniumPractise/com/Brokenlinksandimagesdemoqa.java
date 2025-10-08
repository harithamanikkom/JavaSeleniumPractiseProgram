package org.seleniumPractise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URI;

import java.util.List;

public class Brokenlinksandimagesdemoqa {
	
	public static void main(String args[])
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		
		//Finds all <a> (anchor) tags on the page and stores them in a list.
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		//Loops through each link found on the page.
		for(WebElement link:links)
		{
			
			//Extracts the href attribute (the actual URL) from each anchor tag.
			String url=link.getAttribute("href");
			
			//Checks if the URL is not null or empty, then calls the checkLink() method to validate it.
			if(url !=null &&!url.isEmpty())
			{
				
				checkLink(url);
			}
		}
				driver.quit();
			}
			
			public static void checkLink(String linkUrl)
			{



				        try {
				        	//Opens a connection to the URL using Java’s HttpURLConnection
				        	
				        	//in Java 20 and above, many constructors of the URL class have been deprecated. 
				        	//The recommended approach now is to use the URI class instead, which offers better encoding and flexibility.
				        	
				            //HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
				        	
				        	/*
				        	 This line opens an HTTP connection to a given URL so you can check its status (e.g., 200 OK, 404 Not Found).
				    HttpURLConnection connection = (HttpURLConnection) URI.create(linkUrl).toURL().openConnection();

				        	 */
				            HttpURLConnection connection = (HttpURLConnection) URI.create(linkUrl).toURL().openConnection();

				            //sends a HEAD request (faster than GET, as it only fetches headers).
				            connection.setRequestMethod("HEAD");
				            
				            //Initiates the connection.
				            connection.connect();
				            
				            //Gets the HTTP response code (e.g., 200 for OK, 404 for Not Found).
				            int responseCode = connection.getResponseCode();

				            
				            //If the response code is 400 or higher, it's considered broken. Otherwise, it's valid.
				            if (responseCode >= 400) {
				                System.out.println("Broken link: " + linkUrl + " - Status code: " + responseCode);
				            } else {
				                System.out.println("Valid link: " + linkUrl);
				            }
				        } //Catches and prints any errors that occur during the link check.
				        catch (Exception e) {
				            System.out.println("Error checking link: " + linkUrl + " - " + e.getMessage());
				        }
				    }
				}

			
		
		
		
	


