package edu.epam.firsttask.factory.impl;


import edu.epam.firsttask.factory.StringFactory;

import java.util.Arrays;
import java.util.List;

public class StringFactoryImpl implements StringFactory {
    public static final String REGEX_DELIMITER = "\\s+";
    @Override
    public List<String> separate(String line) {
        line = line.trim();
        return Arrays.stream(line.split(REGEX_DELIMITER))
                .toList();
    }
}
