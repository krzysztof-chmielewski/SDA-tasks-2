package com.kchmielewski.sda.tasks2.task2;

import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ImperativeTest extends Task2Test {

    public ImperativeTest() {
        super(new Imperative());
    }
}