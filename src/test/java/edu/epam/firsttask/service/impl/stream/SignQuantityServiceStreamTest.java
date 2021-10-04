package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SignQuantityService;
import edu.epam.firsttask.service.impl.common.SignQuantityServiceImpl;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SignQuantityServiceStreamTest extends TestCase {

    SignQuantityService signQuantityService;

    @Before
    public void setUp(){
        signQuantityService = new SignQuantityServiceStream();
    }

    @Test
    public void testGetPositivesQuantity() {
        List<Double> doubleList = List.of(-1.,0.,2.,1.,3.);
        CustomArray customArray = new CustomArray(doubleList);
        Integer expected = 3;
        Integer actual = null;
        try {
            actual = signQuantityService.getPositivesQuantity(customArray);
        } catch (EmptyArrayException e) {
            //ignore
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNegativesQuantity() {
        List<Double> doubleList = List.of(-1.,0.,2.,1.,3.);
        CustomArray customArray = new CustomArray(doubleList);
        Integer expected = 1;
        Integer actual = null;
        try {
            actual = signQuantityService.getNegativesQuantity(customArray);
        } catch (EmptyArrayException e) {
            //ignore
        }
        Assert.assertEquals(expected, actual);
    }
}