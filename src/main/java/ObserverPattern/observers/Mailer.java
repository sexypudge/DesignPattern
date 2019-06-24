package ObserverPattern.observers;

import ObserverPattern.LoginStatus;
import ObserverPattern.Observer;
import ObserverPattern.User;

public class Mailer implements Observer {

    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}