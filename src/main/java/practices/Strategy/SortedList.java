package practices.Strategy;

import java.util.List;

public class SortedList<T> {

    private final List<T> list;
    private final SortedStrategy sortedStrategy;

    public SortedList(List<T> list, SortedStrategy sortedStrategy) {
        this.list = list;
        this.sortedStrategy = sortedStrategy;
    }

    public void sort() {
        sortedStrategy.sort(list);
    }
}
