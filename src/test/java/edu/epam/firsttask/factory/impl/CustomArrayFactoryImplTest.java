package edu.epam.firsttask.factory.impl;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.factory.CustomArrayFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CustomArrayFactoryImplTest {

    CustomArrayFactory customArrayFactory;

    @Before
    public void setUp(){
        customArrayFactory = new CustomArrayFactoryImpl();
    }

    @Test
    public void testGetCustomArrayFromStrings() {
        List<String> stringList = List.of("555", "777.7");
        Double[] expectedInList = {555.,777.7};
        List<Double> doubleList = Arrays.asList(expectedInList);
        CustomArray expected = new CustomArray(doubleList);
        CustomArray actual = customArrayFactory.createCustomArrayFromStrings(stringList);
        Assert.assertEquals(expected, actual);
    }
}