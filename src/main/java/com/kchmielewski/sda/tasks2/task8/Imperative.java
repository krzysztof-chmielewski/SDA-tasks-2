package com.kchmielewski.sda.tasks2.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Imperative implements AdvancedGrouping {
    @Override
    public Map<String, List<Integer>> grouping(List<Integer> elements) {
        Map<String, List<Integer>> result = new HashMap<>();

        for (Integer element : elements) {
            String key = element.toString().substring(0, 1);
            List<Integer> currentValue;
            if (result.containsKey(key)) {
                currentValue = result.get(key);
            } else {
                currentValue = new ArrayList<>();
            }
            currentValue.add(element);
            result.put(key, currentValue);
        }

        return result;
    }
}
