package edu.epam.firsttask.factory.impl;

import edu.epam.firsttask.factory.StringFactory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StringFactoryImplTest extends TestCase {

    StringFactory stringFactory;

    @Before
    public void setUp(){
        stringFactory = new StringFactoryImpl();
    }

    @Test
    public void testSeparate() {
        String line = "55555 d 732    b  0";
        List<String> expected = List.of("55555", "d", "732", "b", "0");
        List<String> actual = stringFactory.separate(line);
        Assert.assertEquals(expected, actual);
    }
}