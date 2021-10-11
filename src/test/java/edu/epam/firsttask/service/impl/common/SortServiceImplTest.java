package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SortService;
import org.junit.jupiter.api.*;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortServiceImplTest {

    SortService sortService;
    CustomArray actual;
    CustomArray expected;

    @BeforeAll
    public void setUp() {
        sortService = new SortServiceImpl();
        expected = new CustomArray(List.of(-1., 1., 2., 10., 33.));
    }

    @BeforeEach
    public void setUpEach() {
        actual = new CustomArray(List.of(-1., 10., 2., 1., 33.));
    }

    @Test
    public void testQuickSort() throws InvalidArrayIndexException {
        sortService.quickSort(actual, 0, actual.size() - 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBubbleSort() throws InvalidArrayIndexException {
        sortService.bubbleSort(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSelectionSort() throws InvalidArrayIndexException {
        sortService.selectionSort(actual);
        Assertions.assertEquals(expected, actual);
    }
}