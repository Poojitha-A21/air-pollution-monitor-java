public class Main {
    public static void main(String[] args) {
        System.out.println("Real-Time Air Pollution Monitor");

        // Option 1: Use serial sensor
        // SensorReader sensorReader = new SensorReader("COM3", 9600);
        // sensorReader.start();

        // Option 2: Use API
        ApiReader apiReader = new ApiReader("YourCity", "YourAPIKey");
        apiReader.start();
    }
}