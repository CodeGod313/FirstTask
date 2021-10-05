package edu.epam.firsttask.filter.impl;

import edu.epam.firsttask.filter.StringFilter;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.PasswordAuthentication;
import java.util.List;

public class StringFilterImplTest {

    StringFilter stringFilter;

    @Before
    public void setUp(){
        stringFilter = new StringFilterImpl();
    }

    @Test
    public void testFilterNum() {
        List<String> strings = List.of("555", "bbb", "ccc", "777.7");
        List<String> expected = List.of("555","777.7");
        List<String> actual = stringFilter.filterNum(strings);
        Assert.assertEquals(expected, actual);
    }
}