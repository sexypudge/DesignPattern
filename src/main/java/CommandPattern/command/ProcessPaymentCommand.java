package CommandPattern.command;

import CommandPattern.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProcessPaymentCommand implements Command {
    private final PaymentService paymentService;
    private final String orderId;

    @Override
    public void execute() {
        paymentService.pay(orderId);
    }

    @Override
    public void undo() {
        paymentService.refund(orderId);
    }
}
