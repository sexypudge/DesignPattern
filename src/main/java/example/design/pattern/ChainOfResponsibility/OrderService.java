package example.design.pattern.ChainOfResponsibility;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private Chain chain;
    private final StepA stepA;
    private final StepB stepB;

    @PostConstruct
    public void init() {
        this.chain = Chain.startWith(stepA)
                .thenNext(stepB)
                .onFailure(orderId -> log.info("Failed {}", orderId))
                .onSuccess(orderId -> log.info("Succeeded {}", orderId))
        ;
    }

    public void process(String request) {
        chain.getFirst().process(request);
    }
}
