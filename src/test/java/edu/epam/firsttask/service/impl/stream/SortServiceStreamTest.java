package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SortServiceStreamTest {

    SortServiceStream sortService;

    @Before
    public void setUp(){
        sortService = new SortServiceStream();
    }

    @Test
    public void testStreamSort() {
        CustomArray actual = new CustomArray(List.of(-1.,10.,2.,1.));
        sortService.streamSort(actual);
        CustomArray expected = new CustomArray(List.of(-1.,1.,2.,10.));
        Assert.assertEquals(expected,actual);
    }
}