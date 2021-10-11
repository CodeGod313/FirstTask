package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.AverageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AverageServiceImplTest {

    AverageService averageService;

    @BeforeAll
    public void setUp() {
        averageService = new AverageServiceImpl();
    }

    @Test
    public void testGetAverage() throws InvalidArrayIndexException {
        Double[] values = {777.7, 555.5};
        CustomArray customArray = new CustomArray(Arrays.asList(values));
        Double expected = 666.6;
        Double actual = averageService.calculateAverage(customArray)
                .getAsDouble();
        Assertions.assertEquals(expected, actual);
    }
}