package ImageConvert;

import com.google.gson.JsonObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImageToJsonTest {
    @Test
    public void testExtractedTextFromImage() {
        // Extract text from image
        String imagePath = "C:\\Users\\wbox62\\eclipse-workspace\\ImageToJsonUtility\\target\\HappyPathiOS11may2024.png"
        		+ ""
        		+ ""
        		+ "";
        String extractedText = ImageToText.extractTextFromImage(imagePath);

        // Convert text to JSON
        JsonObject jsonObject = TextToJson.convertTextToJson(extractedText);

        // Print JSON to console
        System.out.println(jsonObject.toString());

        // Use JSON data in your Selenium tests
        WebDriver driver = new ChromeDriver();
        // Your Selenium test logic here using the JSON data
        // e.g., driver.findElement(By.id("someElement")).sendKeys(jsonObject.get("extractedText").getAsString());

        driver.quit();
    }
}


