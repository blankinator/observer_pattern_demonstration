package concrete_implementations.v2.stations;

import concrete_implementations.v2.displays.DisplayV2;

public class TemperatureStation extends Station {

    private int temperature = 0;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(DisplayV2 display : super.getDisplays()){
            display.update(temperature);
        }
    }
}
