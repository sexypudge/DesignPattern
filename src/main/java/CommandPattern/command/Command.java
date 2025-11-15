package CommandPattern.command;

import CommandPattern.request.IRequest;

public interface Command {
    void execute();
    void undo();
}
