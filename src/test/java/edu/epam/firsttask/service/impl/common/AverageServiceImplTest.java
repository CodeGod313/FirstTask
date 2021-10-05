package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.AverageService;
import junit.framework.TestCase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class AverageServiceImplTest {

    static Logger logger = LogManager.getLogger(AverageServiceImplTest.class);

    AverageService averageService;

    @Before
    public void setUp(){
        averageService = new AverageServiceImpl();
    }

    @Test
    public void testGetAverage() {
        Double[] values = {777.7, 555.5};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 666.6;
        Double actual = null;
        try {
            actual = averageService.getAverage(customArray);
        } catch (EmptyArrayException e) {
            logger.error("Array is empty", e);
        }
        Assert.assertEquals(expected,actual);
    }
}