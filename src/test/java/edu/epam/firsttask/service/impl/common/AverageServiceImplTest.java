package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.AverageService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageServiceImplTest {

    AverageService averageService;

    @Before
    public void setUp() {
        averageService = new AverageServiceImpl();
    }

    @Test
    public void testGetAverage() throws InvalidArrayIndexException {
        Double[] values = {777.7, 555.5};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 666.6;
        Double actual = averageService.calculateAverage(customArray)
                .getAsDouble();
        Assert.assertEquals(expected, actual);
    }
}