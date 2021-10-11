package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.ExtremumService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ExtremumServiceStreamTest {

    ExtremumService extremumService;
    Double[] values;
    CustomArray customArray;

    @BeforeAll
    public void setUp() {
        extremumService = new ExtremumServiceStream();
        values = new Double[2];
        values[0] = 555.5;
        values[1] = 777.7;
        customArray = new CustomArray(Arrays.asList(values));
    }

    @Test
    public void testGetMin() throws InvalidArrayIndexException {
        Double expected = 555.5;
        Double actual = extremumService.calculateMin(customArray).getAsDouble();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMax() throws InvalidArrayIndexException {
        Double expected = 777.7;
        Double actual = extremumService.calculateMax(customArray).getAsDouble();
        Assertions.assertEquals(expected, actual);
    }
}