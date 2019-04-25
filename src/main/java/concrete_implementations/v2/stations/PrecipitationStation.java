package concrete_implementations.v2.stations;

import concrete_implementations.v2.displays.DisplayV2;

public class PrecipitationStation extends Station {

    private int precipitation = 0;

    public int getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(DisplayV2 display : super.getDisplays()){
            display.update(precipitation);
        }
    }
}
