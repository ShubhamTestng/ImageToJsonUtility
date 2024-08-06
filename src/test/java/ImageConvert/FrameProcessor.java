package ImageConvert;

import com.google.gson.JsonObject;
import java.io.File;

public class FrameProcessor {
    public static JsonObject processFrame(String framePath) {
        // Extract text from image
        String extractedText = ImageToText.extractTextFromImage(framePath);

        // Convert text to JSON
        JsonObject jsonObject = TextToJson.convertTextToJson(extractedText);

        return jsonObject;
    }
}
