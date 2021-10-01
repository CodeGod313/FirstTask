package edu.epam.firsttask.validator.impl;

import edu.epam.firsttask.factory.impl.CustomArrayFactoryImpl;
import edu.epam.firsttask.validator.NumberValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class NumberValidatorImpl implements NumberValidator {
    static Logger logger = LogManager.getLogger(NumberValidatorImpl.class);
    public static final String REGEX_INTEGER = "-?\\d+";
    public static final String REGEX_FLOAT = "-?\\d+\\.\\d+";

    @Override
    public boolean isNumber(String number) {
        return number.matches(REGEX_INTEGER) || number.matches(REGEX_FLOAT);
    }
}
