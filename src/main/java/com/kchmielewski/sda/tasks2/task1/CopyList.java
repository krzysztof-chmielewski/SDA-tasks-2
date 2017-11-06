package com.kchmielewski.sda.tasks2.task1;

import java.util.List;

public interface CopyList {
    <T> List<T> copy(List<T> list);
}
