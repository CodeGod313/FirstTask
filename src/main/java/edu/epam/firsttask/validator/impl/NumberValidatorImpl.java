package edu.epam.firsttask.validator.impl;

import edu.epam.firsttask.validator.NumberValidator;

public class NumberValidatorImpl implements NumberValidator {
    public static final String REGEX_INTEGER = "-?\\d+";
    public static final String REGEX_FLOAT = "-?\\d+\\.\\d+";

    @Override
    public boolean isNumber(String number) {
        return number.matches(REGEX_INTEGER) || number.matches(REGEX_FLOAT);
    }
}
