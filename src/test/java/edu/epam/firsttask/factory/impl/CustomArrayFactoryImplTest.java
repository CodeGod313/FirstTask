package edu.epam.firsttask.factory.impl;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.factory.CustomArrayFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CustomArrayFactoryImplTest {

    CustomArrayFactory customArrayFactory;

    @BeforeAll
    public void setUp() {
        customArrayFactory = new CustomArrayFactoryImpl();
    }

    @Test
    public void testGetCustomArrayFromStrings() {
        List<String> stringList = List.of("555", "777.7");
        Double[] expectedInList = {555., 777.7};
        List<Double> doubleList = Arrays.asList(expectedInList);
        CustomArray expected = new CustomArray(doubleList);
        CustomArray actual = customArrayFactory.createCustomArrayFromStrings(stringList);
        Assertions.assertEquals(expected, actual);
    }
}