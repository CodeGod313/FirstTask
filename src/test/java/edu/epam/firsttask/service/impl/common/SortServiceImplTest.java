package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SortService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SortServiceImplTest {

    SortService sortService;

    @Before
    public void setUp() {
        sortService = new SortServiceImpl();
    }

    @Test
    public void testQuickSort() throws InvalidArrayIndexException {
        CustomArray actual = new CustomArray(List.of(-1., 10., 2., 1., 33.));
        sortService.quickSort(actual, 0, actual.size() - 1);
        CustomArray expected = new CustomArray(List.of(-1., 1., 2., 10., 33.));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBubbleSort() throws InvalidArrayIndexException {
        CustomArray actual = new CustomArray(List.of(-1., 10., 2., 1.));
        sortService.bubbleSort(actual);
        CustomArray expected = new CustomArray(List.of(-1., 1., 2., 10.));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSelectionSort() throws InvalidArrayIndexException {
        CustomArray actual = new CustomArray(List.of(-1., 10., 2., 1.));
        sortService.selectionSort(actual);
        CustomArray expected = new CustomArray(List.of(-1., 1., 2., 10.));
        Assert.assertEquals(expected, actual);
    }
}