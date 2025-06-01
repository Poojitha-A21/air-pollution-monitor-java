import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiReader extends Thread {
    private String city;
    private String apiKey;

    public ApiReader(String city, String apiKey) {
        this.city = city;
        this.apiKey = apiKey;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String url = "https://api.waqi.info/feed/" + city + "/?token=" + apiKey;
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                String data = DataParser.parse(response.toString());
                Logger.log(data);
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println("Error reading API: " + e.getMessage());
                try { Thread.sleep(5000); } catch (Exception ignored) {}
            }
        }
    }
}