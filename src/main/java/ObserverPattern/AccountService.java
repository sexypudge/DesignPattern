package ObserverPattern;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AccountService implements Subject {

    private final User user;

    private final List<Observer> observers = new ArrayList<>();

    public AccountService(String email, String ip) {
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }

    public void attach(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(user);
        }
    }

    public void changeStatus(LoginStatus status) {
        user.setStatus(status);
        log.info("Status is changed");
        this.notifyAllObserver();
    }

    public void login() {
        if(!this.isValidIP()){
            user.setStatus(LoginStatus.INVALID);
        } else if (this.isValidEmail()) {
            user.setStatus(LoginStatus.SUCCESS);
        } else {
            user.setStatus(LoginStatus.FAILURE);
        }
        log.info("Login handled");

        this.notifyAllObserver();
    }

    private boolean isValidIP(){
        return "127.0.0.1".equals(user.getIp());
    }

    private boolean isValidEmail() {
        return "contact@luongnv.com".equalsIgnoreCase(user.getEmail());
    }
}