package state.impl;

import state.State;

public class NewState implements State {
    public void handleRequest() {
        System.out.println("Create a new document");
    }
}
