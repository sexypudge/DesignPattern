package ObserverPattern.observers;


import ObserverPattern.LoginStatus;
import ObserverPattern.Observer;
import ObserverPattern.User;

public class Protector implements Observer {

    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}