package CommandPattern.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Slf4j
public class CommandBus {
    public void dispatch(List<Command> commands) {
        List<Command> executed = new ArrayList<>();
        try {
            for (Command command : commands) {
                command.execute();
                executed.add(command);
            }
        } catch (Exception ex) {
            // rollback theo thứ tự ngược lại
            Collections.reverse(executed);
            for (Command cmd : executed) {
                try {
                    cmd.undo();
                } catch (Exception rollbackEx) {
                    // log rollback lỗi nhưng vẫn tiếp tục rollback các command trước đó
                    log.error("Failed to rollback: " + rollbackEx.getMessage());
                }
            }
            throw new RuntimeException("Failed to execute command sequence", ex);
        }
    }
}
