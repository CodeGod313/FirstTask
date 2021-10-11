package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.ExtremumService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ExtremumServiceStreamTest {

    ExtremumService extremumService = new ExtremumServiceStream();

    @Test
    public void testGetMin() throws EmptyArrayException {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 555.5;
        Double actual = extremumService.calculateMin(customArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMax() throws EmptyArrayException {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 777.7;
        Double actual = extremumService.calculateMax(customArray);
        Assert.assertEquals(expected, actual);
    }
}