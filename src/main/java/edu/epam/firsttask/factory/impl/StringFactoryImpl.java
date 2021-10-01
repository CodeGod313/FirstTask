package edu.epam.firsttask.factory.impl;


import edu.epam.firsttask.factory.StringFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class StringFactoryImpl implements StringFactory {
    static Logger logger = LogManager.getLogger(StringFactoryImpl.class);
    public static final String REGEX_DELIMITER = "\\s+";
    @Override
    public List<String> separate(String line) {
        line = line.trim();
        return Arrays.stream(line.split(REGEX_DELIMITER))
                .toList();
    }
}
