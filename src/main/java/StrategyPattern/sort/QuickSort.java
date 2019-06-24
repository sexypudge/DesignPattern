package StrategyPattern.sort;

import StrategyPattern.SortStrategy;

import java.util.List;

public class QuickSort implements SortStrategy {

    public <T> void sort(List<T> items) {
        System.out.println("Quick sort");
    }
}
