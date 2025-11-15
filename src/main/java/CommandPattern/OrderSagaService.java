package CommandPattern;

import CommandPattern.command.*;
import CommandPattern.request.OrderRequest;
import CommandPattern.service.InventoryService;
import CommandPattern.service.OrderService;
import CommandPattern.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderSagaService {

    private final CommandBus commandBus;
    private final OrderService orderService;
    private final InventoryService inventoryService;
    private final PaymentService paymentService;

    public void processOrder(OrderRequest request) {
        List<Command> commands = List.of(
                new CreateOrderCommand(orderService, request),
                new ReserveInventoryCommand(inventoryService, request.getOrderId()),
                new ProcessPaymentCommand(paymentService, request.getOrderId())
        );

        commandBus.dispatch(commands);
    }
}
