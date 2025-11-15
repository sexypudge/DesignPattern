package example.design.pattern.ChainOfResponsibility;

public interface ChainStep extends ChainCompensate, ChainProcess {
    void setNext(ChainProcess next);

    void setPrevious(ChainCompensate prev);
}
