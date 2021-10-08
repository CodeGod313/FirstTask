package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.ExtremumService;
import junit.framework.TestCase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
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
    public void testGetMin() throws EmptyArrayException {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 555.5;
        Double actual = extremumService.getMin(customArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMax() throws EmptyArrayException {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 777.7;
        Double actual = extremumService.getMax(customArray);

        Assert.assertEquals(expected, actual);
    }
}