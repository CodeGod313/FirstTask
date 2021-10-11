package edu.epam.firsttask.filter.impl;

import edu.epam.firsttask.filter.StringFilter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringFilterImplTest {

    StringFilter stringFilter;

    @BeforeAll
    public void setUp() {
        stringFilter = new StringFilterImpl();
    }

    @Test
    public void testFilterNum() {
        List<String> strings = List.of("555", "bbb", "ccc", "777.7");
        List<String> expected = List.of("555", "777.7");
        List<String> actual = stringFilter.filterNum(strings);
        Assertions.assertEquals(expected, actual);
    }
}