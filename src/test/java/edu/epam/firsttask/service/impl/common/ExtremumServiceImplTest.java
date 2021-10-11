package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.ExtremumService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ExtremumServiceImplTest  {


    ExtremumService extremumService;

    @Before
    public void setUp(){
        extremumService = new ExtremumServiceImpl();
    }

    @Test
    public void testGetMin() throws InvalidArrayIndexException {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 555.5;
        Double actual = extremumService.calculateMin(customArray).getAsDouble();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMax() throws InvalidArrayIndexException {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 777.7;
        Double actual = extremumService.calculateMax(customArray).getAsDouble();
        Assert.assertEquals(expected, actual);
    }
}