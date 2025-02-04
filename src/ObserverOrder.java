import java.util.ArrayList;
import java.util.List;

public class ObserverOrder {
    private List<INotification> observers = new ArrayList<>();

    public void addObserver(INotification observer) {
        this.observers.add(observer);
    }

    public void removeObserver(INotification observer) {
        this.observers.remove(observer);
    }

    public void notifyTheUsers(String message) {
        for (INotification observer : observers) {
            observer.sendNotification(message);
        }
    }
}
