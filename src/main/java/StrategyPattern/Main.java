package StrategyPattern;

import StrategyPattern.sort.MergeSort;
import StrategyPattern.sort.QuickSort;

public class Main {

    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("java");
        sortedList.add("developer");

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

    }
}
