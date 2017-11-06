package com.kchmielewski.sda.tasks2.task8;

import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class FunctionalTest extends Task8Test {

    public FunctionalTest() {
        super(new Functional());
    }
}