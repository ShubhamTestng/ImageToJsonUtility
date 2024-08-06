package ImageConvert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ImageConvert.FrameProcessor;
import com.google.gson.JsonObject;

public class ImageToJsonTestVideo {
    @Test
    public void testExtractedTextFromFrame() {
        // Path to a specific frame image
        String framePath = "C:\\videoframe\\frames_0005.png"; // Update as needed

        // Process the frame and get JSON
        JsonObject jsonObject = FrameProcessor.processFrame(framePath);

        // Print JSON to console
        System.out.println(jsonObject.toString());

        // Use JSON data in your Selenium tests
        WebDriver driver = new ChromeDriver();
        // Example: Use extracted text in your Selenium test
        String extractedText = jsonObject.get("extractedText").getAsString();
        // Perform actions based on the extracted text
        // Example: driver.findElement(By.id("someElement")).sendKeys(extractedText);

        driver.quit();
    }
}
