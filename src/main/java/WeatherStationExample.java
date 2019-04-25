import concrete_implementations.v1.*;

public class WeatherStationExample {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Display temperature = new TemperatureDisplay(station);
        station.add(temperature);

        Display humidity = new HumidityDisplay(station);
        station.add(humidity);

        Display precipitation = new PrecipitationDisplay(station);
        station.add(precipitation);

        System.out.println("Setting temperature:");
        station.setTemperature(10);
        System.out.println();

        System.out.println("Setting humidity:");
        station.setHumidity(23);
        System.out.println();

        System.out.println("Setting precipitation:");
        station.setPrecipitation(5);
    }
}
