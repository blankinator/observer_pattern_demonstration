package concrete_implementations.v1;

public class TemperatureDisplay extends Display{

    public TemperatureDisplay(WeatherStation station) {
        super(station);
    }

    @Override
    public void update() {
        System.out.println("Temperature: " + super.getStation().getTemperature() + "°C");
    }
}
