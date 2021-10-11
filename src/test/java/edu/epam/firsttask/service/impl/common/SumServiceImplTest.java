package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SumService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SumServiceImplTest {

    SumService sumService;

    @Before
    public void setUp(){
        sumService = new SumServiceImpl();
    }

    @Test
    public void testGetSum() throws InvalidArrayIndexException {
        CustomArray customArray = new CustomArray(List.of(5.55,6.,7.,8.));
        Double expected = 26.55;
        Double actual = sumService.calculateSum(customArray);
        Assert.assertEquals(expected,actual);
    }
}