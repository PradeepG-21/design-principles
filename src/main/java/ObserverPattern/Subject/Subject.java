package ObserverPattern.Subject;

import ObserverPattern.Observers.Observer;

import java.util.List;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(List<Observer> observers);
}
