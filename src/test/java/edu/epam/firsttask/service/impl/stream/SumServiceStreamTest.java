package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SumService;
import edu.epam.firsttask.service.impl.common.SumServiceImpl;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SumServiceStreamTest {

    SumService sumService;

    @Before
    public void setUp() {
        sumService = new SumServiceStream();
    }

    @Test
    public void testGetSum() throws EmptyArrayException {
        CustomArray customArray = new CustomArray(List.of(5.55, 6., 7., 8.));
        Double expected = 26.55;
        Double actual = sumService.getSum(customArray);
    }
}