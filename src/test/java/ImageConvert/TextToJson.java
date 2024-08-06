package ImageConvert;

import com.google.gson.JsonObject;

public class TextToJson {
    public static JsonObject convertTextToJson(String text) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("extractedText", text);
        return jsonObject;
    }
}

