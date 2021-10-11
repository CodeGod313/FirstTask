package edu.epam.firsttask.validator.impl;

import edu.epam.firsttask.validator.NumberValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NumberValidatorImplTest {

    NumberValidator numberValidator;

    @BeforeAll
    public void setUp() {
        numberValidator = new NumberValidatorImpl();
    }

    @Test
    public void testIsNumber() {
        String numberString = "555.777";
        boolean expected = true;
        boolean actual = numberValidator.isNumber(numberString);
        Assertions.assertEquals(expected, actual);
    }
}