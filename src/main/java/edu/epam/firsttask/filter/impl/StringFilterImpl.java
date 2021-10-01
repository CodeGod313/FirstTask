package edu.epam.firsttask.filter.impl;


import edu.epam.firsttask.filter.StringFilter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import edu.epam.firsttask.validator.NumberValidator;
import edu.epam.firsttask.validator.impl.NumberValidatorImpl;

import java.util.List;

public class StringFilterImpl implements StringFilter {
    static Logger logger = LogManager.getLogger(StringFilter.class);

    @Override
    public List<String> filterNum(List<String> strings) {
        NumberValidator numberValidator = new NumberValidatorImpl();
        return strings.stream()
                .filter(numberValidator::isNumber)
                .toList();
    }
}

