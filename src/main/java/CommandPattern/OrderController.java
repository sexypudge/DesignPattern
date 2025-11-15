package CommandPattern;

import CommandPattern.request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderSagaService orderSagaService;

    @PostMapping("/orders")
    public ResponseEntity<Void> placeOrder(@RequestBody OrderRequest request) {
        orderSagaService.processOrder(request);
        return ResponseEntity.ok().build();
    }
}