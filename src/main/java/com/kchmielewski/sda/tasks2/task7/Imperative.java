package com.kchmielewski.sda.tasks2.task7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Imperative implements Grouping {
    @Override
    public Map<String, Long> counting(List<String> elements) {
        Map<String, Long> result = new HashMap<>();

        for (String element : elements) {
            Long previousCount = result.putIfAbsent(element, 1L);
            if (previousCount != null) {
                result.put(element, previousCount + 1);
            }
        }

        return result;
    }
}
