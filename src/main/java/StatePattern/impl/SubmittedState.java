package state.impl;

import state.State;

public class SubmittedState implements State {
    public void handleRequest() {
        System.out.println("Submitted");
    }
}
