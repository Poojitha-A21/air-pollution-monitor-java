import java.io.InputStream;
import java.util.Scanner;

public class SensorReader extends Thread {
    private String port;
    private int baudRate;

    public SensorReader(String port, int baudRate) {
        this.port = port;
        this.baudRate = baudRate;
    }

    @Override
    public void run() {
        System.out.println("Starting sensor reader on " + port);
        // Simulated loop
        for (int i = 0; i < 5; i++) {
            String data = "PM2.5: " + (Math.random() * 100);
            Logger.log(data);
            try { Thread.sleep(2000); } catch (Exception e) {}
        }
    }
}