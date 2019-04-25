package concrete_implementations.v2.stations;

import concrete_implementations.v2.displays.DisplayV2;

public class HumidityStation extends Station {

    private int humidity = 0;

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(DisplayV2 display : super.getDisplays()){
            display.update(humidity);
        }
    }
}
