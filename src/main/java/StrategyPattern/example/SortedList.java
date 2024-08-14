package StrategyPattern.example;

import java.util.ArrayList;
import java.util.List;

public class SortedList<T> {

    private List<T> list = new ArrayList<>();
    private final SortedStrategy sortedStrategy;

    public SortedList(List<T> list, SortedStrategy sortedStrategy) {
        this.list = list;
        this.sortedStrategy = sortedStrategy;
    }

    public void sort(){
        sortedStrategy.sort(list);
    }
}
