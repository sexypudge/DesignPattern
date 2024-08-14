package StatePattern.impl;

import StatePattern.State;

public class SubmittedState implements State {
    public void handleRequest() {
        System.out.println("Submitted");
    }
}
