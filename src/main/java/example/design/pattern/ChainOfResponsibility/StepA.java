package example.design.pattern.ChainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StepA implements ChainStep {
    private ChainCompensate previousStep;
    private ChainProcess nextStep;

    @Override
    public void process(String orderId) {
        log.info("processing StepA");
        nextStep.process(orderId);
    }

    @Override
    public void compensate(String orderId) {
        log.info("compensate StepA");
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
