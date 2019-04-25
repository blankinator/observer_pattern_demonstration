package concrete_implementations.v2.displays;

public class TemperatureDisplayV2 extends DisplayV2 {

    @Override
    public void update(int value) {
        System.out.println("Temperature: " + value + "°C");
    }
}
