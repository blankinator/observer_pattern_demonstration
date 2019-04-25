package concrete_implementations.v1;

public class PrecipitationDisplay extends Display{

    public PrecipitationDisplay(WeatherStation station) {
        super(station);
    }

    @Override
    public void update() {
        System.out.println(super.getStation().getPrecipitation() + "mm precipitation");
    }
}
