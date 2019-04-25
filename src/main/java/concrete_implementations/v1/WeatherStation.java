package concrete_implementations.v1;

import observer_interfaces.v1.IObservable;
import observer_interfaces.v1.IObserver;

import java.util.HashSet;

public class WeatherStation implements IObservable {

    private HashSet<Display> displays = new HashSet<>();

    private int temperature = 0;
    private int humidity = 0;
    private int precipitation = 0;

    @Override
    public void add(IObserver observer){
        if (observer instanceof Display){
            this.displays.add((Display) observer);
        }
    }

    @Override
    public void remove(IObserver observer) {
        if (observer instanceof Display){
            this.displays.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Display display : this.displays){
            display.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.notifyObservers();
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
        this.notifyObservers();
    }
}
