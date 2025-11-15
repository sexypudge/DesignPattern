package example.design.pattern.ChainOfResponsibility;

import lombok.Data;

import java.util.function.Consumer;

@Data
public class Chain {

    private final ChainStep first;
    private ChainStep last;

    private Chain(ChainStep first) {
        this.first = first;
        this.last = first;
    }

    public static Chain startWith(ChainStep first) {
        return new Chain(first);
    }

    public Chain thenNext(ChainStep next) {
        this.last.setNext(next);
        next.setPrevious(this.last);
        this.last = next;
        return this;
    }

    public Chain onSuccess(Consumer<String> handler) {
        this.last.setNext(handler::accept);
        return this;
    }

    public Chain onFailure(Consumer<String> handler) {
        this.first.setPrevious(handler::accept);
        return this;
    }

}
