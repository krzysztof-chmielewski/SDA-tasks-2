package com.kchmielewski.sda.tasks2.task8;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task8Test {
    private final AdvancedGrouping tested;

    Task8Test(AdvancedGrouping tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyReturnsEmpty() {
        assertThat(tested.grouping(Collections.emptyList())).isEmpty();
    }

    @Test
    public void forOneElementReturnsItsFirstDigitAndSingletonList() {
        assertThat(tested.grouping(Collections.singletonList(1)))
                .containsExactly(new AbstractMap.SimpleImmutableEntry<>("1", Collections.singletonList(1)));
    }

    @Test
    public void forFourSameElementsReturnsTheirFirstDigit() {
        assertThat(tested.grouping(Arrays.asList(3, 33, 333, 3333)))
                .containsExactly(new AbstractMap.SimpleImmutableEntry<>("3", Arrays.asList(3, 33, 333, 3333)));
    }

    @Test
    public void forDifferentElementsReturnsProperMap() {
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("3", Arrays.asList(31, 3));
        result.put("1", Arrays.asList(15, 1));
        result.put("5", Arrays.asList(5, 500005));
        result.put("9", Collections.singletonList(99));
        assertThat(tested.grouping(Arrays.asList(31, 3, 15, 5, 1, 500005, 99))).isEqualTo((result));
    }
}
