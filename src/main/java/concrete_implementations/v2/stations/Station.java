package concrete_implementations.v2.stations;

import concrete_implementations.v2.displays.DisplayV2;
import observer_interfaces.v2.IObservableV2;
import observer_interfaces.v2.IObserverV2;

import java.util.HashSet;

public abstract class Station implements IObservableV2 {

    private HashSet<DisplayV2> displays = new HashSet<>();

    @Override
    public void add(IObserverV2 observer){
        if (observer instanceof DisplayV2){
            this.displays.add((DisplayV2) observer);
        }
    }

    @Override
    public void remove(IObserverV2 observer) {
        if (observer instanceof DisplayV2){
            this.displays.remove(observer);
        }
    }

    public HashSet<DisplayV2> getDisplays() {
        return displays;
    }
}
