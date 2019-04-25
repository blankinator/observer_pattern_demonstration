package concrete_implementations.v1;

import observer_interfaces.v1.IObserver;

public abstract class Display implements IObserver {

    private final WeatherStation station;

    public Display(WeatherStation station){
        this.station = station;
    }

    public WeatherStation getStation() {
        return station;
    }
}
