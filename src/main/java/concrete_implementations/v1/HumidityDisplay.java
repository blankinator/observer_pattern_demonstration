package concrete_implementations.v1;

public class HumidityDisplay extends Display{

    public HumidityDisplay(WeatherStation station) {
        super(station);
    }

    @Override
    public void update() {
        System.out.println(super.getStation().getHumidity() + "% humidity");
    }
}
