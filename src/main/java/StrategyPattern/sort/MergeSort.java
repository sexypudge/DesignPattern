package StrategyPattern.sort;

import StrategyPattern.SortStrategy;

import java.util.List;

public class MergeSort implements SortStrategy {

    public <T> void sort(List<T> items) {
        System.out.println("Merge sort");
    }
}
