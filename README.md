# Real-Time Air Pollution Density Measurement (Java)

This project measures air pollution density in real-time using Java. Data can be read from a serial device (like Arduino) or an online API.

## Features

- Real-time air quality data retrieval
- Sensor or API integration
- Console or GUI output
- Java-based modular code

## Requirements

- Java 8 or above
- (Optional) Arduino + Gas Sensor (e.g., MQ135)

## How to Run

Compile and run:

```bash
javac Main.java
java Main
```

If using API, replace the API key and city in `ApiReader.java`.

## File Structure

- `Main.java`: Entry point
- `SensorReader.java`: Handles serial data (from Arduino)
- `ApiReader.java`: Reads air quality from an API
- `DataParser.java`: Parses raw data
- `Logger.java`: Logs data