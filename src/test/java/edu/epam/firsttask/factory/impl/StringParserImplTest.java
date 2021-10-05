package edu.epam.firsttask.factory.impl;

import edu.epam.firsttask.parser.StringParser;
import edu.epam.firsttask.parser.impl.StringParserImpl;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StringParserImplTest {

    StringParser stringParser;

    @Before
    public void setUp(){
        stringParser = new StringParserImpl();
    }

    @Test
    public void testSeparate() {
        String line = "55555 d 732    b  0";
        List<String> expected = List.of("55555", "d", "732", "b", "0");
        List<String> actual = stringParser.separate(line);
        Assert.assertEquals(expected, actual);
    }
}