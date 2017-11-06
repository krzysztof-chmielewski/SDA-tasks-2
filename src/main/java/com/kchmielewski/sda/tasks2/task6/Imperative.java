package com.kchmielewski.sda.tasks2.task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Imperative implements Partitioning {
    @Override
    public Map<Boolean, List<Integer>> partitionEvenWithOdds(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer integer : numbers) {
            if (integer % 2 == 0) {
                evenNumbers.add(integer);
            } else {
                oddNumbers.add(integer);
            }
        }

        Map<Boolean, List<Integer>> result = new HashMap<>();
        result.put(true, evenNumbers);
        result.put(false, oddNumbers);

        return result;
    }
}
