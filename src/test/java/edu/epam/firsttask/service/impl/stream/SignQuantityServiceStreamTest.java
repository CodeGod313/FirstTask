package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SignQuantityService;
import org.junit.jupiter.api.*;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SignQuantityServiceStreamTest {

    SignQuantityService signQuantityService;
    List<Double> doubleList;
    CustomArray customArray;

    @BeforeAll
    public void setUp() {
        signQuantityService = new SignQuantityServiceStream();
        doubleList = List.of(-1., 0., 2., 1., 3.);
        customArray = new CustomArray(doubleList);
    }

    @Test
    public void testGetPositivesQuantity() throws InvalidArrayIndexException {
        Integer expected = 3;
        Integer actual = signQuantityService.calculatePositivesQuantity(customArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetNegativesQuantity() throws InvalidArrayIndexException {
        Integer expected = 1;
        Integer actual = signQuantityService.calculateNegativesQuantity(customArray);
        Assertions.assertEquals(expected, actual);
    }
}