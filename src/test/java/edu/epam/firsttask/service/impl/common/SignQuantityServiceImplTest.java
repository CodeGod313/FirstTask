package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SignQuantityService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SignQuantityServiceImplTest {

    SignQuantityService signQuantityService;

    @Before
    public void setUp(){
        signQuantityService = new SignQuantityServiceImpl();
    }

    @Test
    public void testGetPositivesQuantity() throws InvalidArrayIndexException {
        List<Double> doubleList = List.of(-1.,0.,2.,1.,3.);
        CustomArray customArray = new CustomArray(doubleList);
        Integer expected = 3;
        Integer actual = signQuantityService.calculatePositivesQuantity(customArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNegativesQuantity() throws InvalidArrayIndexException {
        List<Double> doubleList = List.of(-1.,0.,2.,1.,3.);
        CustomArray customArray = new CustomArray(doubleList);
        Integer expected = 1;
        Integer actual = signQuantityService.calculateNegativesQuantity(customArray);
        Assert.assertEquals(expected, actual);
    }
}