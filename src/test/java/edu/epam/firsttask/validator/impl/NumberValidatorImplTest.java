package edu.epam.firsttask.validator.impl;

import edu.epam.firsttask.validator.NumberValidator;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberValidatorImplTest extends TestCase {

    NumberValidator numberValidator;

    @Before
    public void setUp(){
        numberValidator = new NumberValidatorImpl();
    }

    @Test
    public void testIsNumber() {
        String numberString = "555.777";
        boolean expected = true;
        boolean actual = numberValidator.isNumber(numberString);
        Assert.assertEquals(expected, actual);
    }
}