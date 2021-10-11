package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SumService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SumServiceStreamTest {

    SumService sumService;

    @BeforeAll
    public void setUp() {
        sumService = new SumServiceStream();
    }

    @Test
    public void testGetSum() throws InvalidArrayIndexException {
        CustomArray customArray = new CustomArray(List.of(5.55, 6., 7., 8.));
        Double expected = 26.55;
        Double actual = sumService.calculateSum(customArray);
        Assertions.assertEquals(expected, actual);
    }
}