import org.json.JSONObject;

public class DataParser {
    public static String parse(String json) {
        JSONObject obj = new JSONObject(json);
        if (!obj.getString("status").equals("ok")) return "Invalid data";

        JSONObject data = obj.getJSONObject("data");
        int aqi = data.getInt("aqi");
        return "Air Quality Index: " + aqi;
    }
}