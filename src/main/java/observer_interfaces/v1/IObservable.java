package observer_interfaces.v1;

public interface IObservable {

    void  add(IObserver observer);

    void remove(IObserver observer);

    void notifyObservers(); // notify not possible since it is a final method from Object class
}
