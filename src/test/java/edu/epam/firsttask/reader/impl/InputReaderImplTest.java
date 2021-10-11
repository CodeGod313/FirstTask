package edu.epam.firsttask.reader.impl;

import edu.epam.firsttask.exception.WrongFilePathException;
import edu.epam.firsttask.reader.InputReader;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputReaderImplTest {

    InputReader inputReader;

    @Before
    public void setUp(){
        inputReader = new InputReaderImpl();
    }

    @Test
    public void testReadStringsFromFile() throws WrongFilePathException {
        Path path = Paths.get("src/test/resources/input/testData.txt");
        List<String> expected = List.of("123 456 kkkk","ddd b");
        List<String> actual = inputReader.readStringsFromFile(path);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = WrongFilePathException.class)
    public void testReadStingsFromFileWrongPathException() throws WrongFilePathException {
        Path path = Paths.get("hello world---");
        inputReader.readStringsFromFile(path);
    }
}