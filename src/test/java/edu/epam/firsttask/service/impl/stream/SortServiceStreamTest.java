package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortServiceStreamTest {

    SortServiceStream sortService;

    @BeforeAll
    public void setUp() {
        sortService = new SortServiceStream();
    }

    @Test
    public void testStreamSort() {
        CustomArray actual = new CustomArray(List.of(-1., 10., 2., 1.));
        sortService.streamSort(actual);
        CustomArray expected = new CustomArray(List.of(-1., 1., 2., 10.));
        Assertions.assertEquals(expected, actual);
    }
}