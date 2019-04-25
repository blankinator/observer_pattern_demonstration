package abstract_implementations;

import observer_interfaces.v1.IObservable;
import observer_interfaces.v1.IObserver;

import java.util.ArrayList;

public abstract class GenericServer implements IObservable {

    private ArrayList<IObserver> observers = new ArrayList<>();




}
