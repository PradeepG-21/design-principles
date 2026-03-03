package ObserverPattern.Observers;

import ObserverPattern.Subject.Subject;

public interface Observer {
    void update();
    void subscribe(Subject s);
}
