package edu.epam.firsttask.factory.impl;

import edu.epam.firsttask.parser.StringParser;
import edu.epam.firsttask.parser.impl.StringParserImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringParserImplTest {

    StringParser stringParser;

    @BeforeAll
    public void setUp() {
        stringParser = new StringParserImpl();
    }

    @Test
    public void testSeparate() {
        String line = "55555 d 732    b  0";
        List<String> expected = List.of("55555", "d", "732", "b", "0");
        List<String> actual = stringParser.separateLine(line);
        Assertions.assertEquals(expected, actual);
    }
}