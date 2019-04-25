package concrete_implementations.v2;

import concrete_implementations.v2.stations.HumidityStation;
import concrete_implementations.v2.stations.PrecipitationStation;
import concrete_implementations.v2.stations.TemperatureStation;
import observer_interfaces.v2.IObservableV2;
import observer_interfaces.v2.IObserverV2;

public class WeatherStationV2{

    private final TemperatureStation temperature_station = new TemperatureStation();
    private final HumidityStation humidity_station = new HumidityStation();
    private final PrecipitationStation precipitation_station = new PrecipitationStation();

    public synchronized void addDisplay(IObserverV2 display, boolean temperature, boolean humidity, boolean precipitation){
        if (temperature){
            this.temperature_station.add(display);
        }
        if (humidity){
            this.humidity_station.add(display);
        }
        if (precipitation){
            this.precipitation_station.add(display);
        }
    }

    public int getTemperature() {
        return this.temperature_station.getTemperature();
    }

    public int getHumidity() {
        return this.humidity_station.getHumidity();
    }

    public int getPrecipitation() {
        return this.precipitation_station.getPrecipitation();
    }

    public synchronized void setTemperature(int temperature) {
        this.temperature_station.setTemperature(temperature);
    }

    public synchronized void setHumidity(int humidity) {
        this.humidity_station.setHumidity(humidity);
    }

    public synchronized void setPrecipitation(int precipitation) {
        this.precipitation_station.setPrecipitation(precipitation);
    }
}
