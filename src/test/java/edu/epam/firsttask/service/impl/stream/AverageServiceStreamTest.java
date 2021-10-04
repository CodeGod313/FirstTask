package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.AverageService;
import edu.epam.firsttask.service.impl.common.AverageServiceImpl;
import junit.framework.TestCase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class AverageServiceStreamTest extends TestCase {

    static Logger logger = LogManager.getLogger(AverageServiceStreamTest.class);
    AverageService averageService;

    @Before
    public void setUp(){
        averageService = new AverageServiceStream();
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