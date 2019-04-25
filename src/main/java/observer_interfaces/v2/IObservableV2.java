package observer_interfaces.v2;

public interface IObservableV2 {

    void  add(IObserverV2 observer);

    void remove(IObserverV2 observer);

    void notifyObservers(); // notify not possible since it is a final method from Object class
}
