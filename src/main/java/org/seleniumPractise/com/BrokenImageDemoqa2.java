package org.seleniumPractise.com;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageDemoqa2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");

        List<WebElement> images = driver.findElements(By.tagName("img"));

        for (WebElement img : images) {
            String imageUrl = img.getAttribute("src");

            if (imageUrl != null && !imageUrl.isEmpty()) {
                checkImageHttp(imageUrl);
                checkImageVisual(driver, img, imageUrl);
            }
        }

        driver.quit();
    }

    // 🔍 Check image using HTTP status code
    public static void checkImageHttp(String imageUrl) {
        try {
            HttpURLConnection connection = (HttpURLConnection) URI.create(imageUrl).toURL().openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println("❌ Broken image (HTTP): " + imageUrl + " - Status code: " + responseCode);
            } else {
                System.out.println("✅ Valid image (HTTP): " + imageUrl);
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error checking image (HTTP): " + imageUrl + " - " + e.getMessage());
        }
    }

    // 👁️ Check image using visual rendering
    public static void checkImageVisual(WebDriver driver, WebElement img, String imageUrl) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Boolean isImageLoaded = (Boolean) js.executeScript(
                "return arguments[0].complete && arguments[0].naturalWidth > 0", img);

            if (!isImageLoaded) {
                System.out.println("❌ Broken image (Visual): " + imageUrl + " - Not rendered properly");
            } else {
                System.out.println("✅ Valid image (Visual): " + imageUrl);
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error checking image (Visual): " + imageUrl + " - " + e.getMessage());
        }
    }
}
