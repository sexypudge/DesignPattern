package example.design.pattern.ChainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StepB implements ChainStep {

    private ChainCompensate previousStep;
    private ChainProcess nextStep;

    @Override
    public void process(String orderId) {
        log.info("processing stepB {}", orderId);
        boolean hasExceptionSimulation = true; // in real project, it's a Error Response signal
        if (hasExceptionSimulation) {
            log.error("Failed to proceed stepB, reversing the whole flow of order {}", orderId);
            this.compensate(orderId);
            return;
        }
        nextStep.process(orderId);

    }

    @Override
    public void compensate(String orderId) {
        log.info("compensate stepB - orderId {}", orderId);
        previousStep.compensate(orderId);
    }

    @Override
    public void setNext(ChainProcess next) {
        this.nextStep = next;
    }

    @Override
    public void setPrevious(ChainCompensate prev) {
        this.previousStep = prev;
    }
}
