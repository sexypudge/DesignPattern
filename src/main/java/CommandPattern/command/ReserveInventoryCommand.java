package CommandPattern.command;

import CommandPattern.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReserveInventoryCommand implements Command {
    private final InventoryService inventoryService;
    private final String orderId;

    @Override
    public void execute() {
        inventoryService.reserveItems(orderId);
    }

    @Override
    public void undo() {
        inventoryService.releaseItems(orderId);
    }
}
