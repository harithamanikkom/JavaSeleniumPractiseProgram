package org.seleniumPractise.com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImageDownload {

	public static void main(String[] args) {
		// Set download directory
		String downloadPath = System.getProperty("user.dir") + "/downloads";
		File downloadDir = new File(downloadPath);
		if (!downloadDir.exists()) {
			downloadDir.mkdirs();
		}

		// Configure Chrome to auto-download files
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", downloadPath);
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/upload-download");

		// 🔽 Extract Base64 image from download button
		WebElement downloadButton = driver.findElement(By.id("downloadButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", downloadButton);
		js.executeScript("arguments[0].click();", downloadButton);

		String base64DataUrl = downloadButton.getAttribute("href");
		if (base64DataUrl != null && base64DataUrl.startsWith("data:image")) {
			try {
				// Remove prefix and decode
				String base64Image = base64DataUrl.split(",")[1];
				byte[] imageBytes = Base64.getDecoder().decode(base64Image);

				// Save image to file
				File outputFile = new File(downloadPath + "/sampleFile.jpeg");
				try (FileOutputStream fos = new FileOutputStream(outputFile)) {
					fos.write(imageBytes);
					System.out.println("✅ Base64 image saved successfully: " + outputFile.getAbsolutePath());
				}
			} catch (Exception e) {
				System.out.println("❌ Failed to save image" + e.getMessage());
			}
			downloadButton.click();

			// 📤 Upload file
			WebElement uploadInput = driver.findElement(By.id("uploadFile"));
			String filePathToUpload = System.getProperty("user.dir") + "/sample1.txt"; // Replace with your file
			uploadInput.sendKeys(filePathToUpload);

			// Verify upload
			WebElement uploadedText = driver.findElement(By.id("uploadedFilePath"));
			System.out.println("📤 Uploaded file path: " + uploadedText.getText());

			driver.quit();
		}
	}
}
