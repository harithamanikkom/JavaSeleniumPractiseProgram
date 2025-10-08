package Sep25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOne {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
WebElement searchbox=driver.findElement(By.xpath("//textarea[@name='q']"));
searchbox.sendKeys("Automation");
searchbox.sendKeys(Keys.ENTER);
Thread.sleep(1000);


	}

}
