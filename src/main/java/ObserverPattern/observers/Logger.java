package ObserverPattern.observers;

import ObserverPattern.Observer;
import ObserverPattern.User;

public class Logger implements Observer {

    public void update(User user) {
        System.out.println("Logger:" + user);
    }
}
