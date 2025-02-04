import java.util.ArrayList;
import java.util.List;

public class ObserverOrder {

    private List<INotification> notifyUser = new ArrayList<>();

    public void addObserver(INotification notifyUser) {
        this.notifyUser.add(notifyUser);
    }

    public void removeObserver(INotification notifyUser) {
        this.notifyUser.remove(notifyUser);
    }

    public void notifyTheUsers(String message) {
        for (INotification notifyUser : notifyUser) {
            notifyUser.sendNotification(message);
        }
    }
}
