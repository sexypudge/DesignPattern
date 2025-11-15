package CommandPattern.command;

import CommandPattern.request.OrderRequest;
import CommandPattern.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CreateOrderCommand implements Command {
    private final OrderService orderService;
    private final OrderRequest request;

    @Override
    public void execute() {
        orderService.createOrder(request);
    }

    public void undo() {
        orderService.cancelOrder(request.getOrderId());
    }
}
