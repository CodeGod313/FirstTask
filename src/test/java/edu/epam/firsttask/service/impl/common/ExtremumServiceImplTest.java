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

public class ExtremumServiceImplTest extends TestCase {

    static Logger logger = LogManager.getLogger(ExtremumServiceImplTest.class);

    ExtremumService extremumService;

    @Before
    public void setUp(){
        extremumService = new ExtremumServiceImpl();
    }

    @Test
    public void testGetMin() {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 555.5;
        Double actual = null;
        try {
            actual = extremumService.getMin(customArray);
        } catch (EmptyArrayException e) {
            logger.error("Array is empty", e);
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMax() {
        Double[] values = {555.5, 777.7};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 777.7;
        Double actual = null;
        try {
            actual = extremumService.getMax(customArray);
        } catch (EmptyArrayException e) {
            logger.error("Array is empty", e);
        }
        Assert.assertEquals(expected, actual);
    }
}