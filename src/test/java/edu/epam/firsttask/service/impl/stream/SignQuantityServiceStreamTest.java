package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SignQuantityService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SignQuantityServiceStreamTest {

    SignQuantityService signQuantityService;

    @Before
    public void setUp(){
        signQuantityService = new SignQuantityServiceStream();
    }

    @Test
    public void testGetPositivesQuantity() throws EmptyArrayException {
        List<Double> doubleList = List.of(-1.,0.,2.,1.,3.);
        CustomArray customArray = new CustomArray(doubleList);
        Integer expected = 3;
        Integer actual = signQuantityService.calculatePositivesQuantity(customArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNegativesQuantity() throws EmptyArrayException {
        List<Double> doubleList = List.of(-1.,0.,2.,1.,3.);
        CustomArray customArray = new CustomArray(doubleList);
        Integer expected = 1;
        Integer actual = signQuantityService.calculateNegativesQuantity(customArray);
        Assert.assertEquals(expected, actual);
    }
}