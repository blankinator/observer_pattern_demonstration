import concrete_implementations.v1.Display;
import concrete_implementations.v2.displays.DisplayV2;
import concrete_implementations.v2.displays.HumidityDisplayV2;
import concrete_implementations.v2.displays.PrecipitationDisplayV2;
import concrete_implementations.v2.displays.TemperatureDisplayV2;
import concrete_implementations.v2.WeatherStationV2;

public class WeatherStationExampleV2 {
    public static void main(String[] args) {

        WeatherStationV2 station = new WeatherStationV2();

        DisplayV2 temperature = new TemperatureDisplayV2();
        station.addDisplay(temperature, true, false, false);

        DisplayV2 humidity = new HumidityDisplayV2();
        station.addDisplay(humidity, false, true, false);

        DisplayV2 precipitation = new PrecipitationDisplayV2();
        station.addDisplay(precipitation, false, false, true);

        DisplayV2 temperature2 = new TemperatureDisplayV2();
        station.addDisplay(temperature2, true, true, false);

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
