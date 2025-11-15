package practices.Strategy;

import java.util.List;

public interface SortedStrategy {
    <T> void sort(List<T> list);
}
