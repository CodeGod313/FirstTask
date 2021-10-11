package edu.epam.firsttask.parser.impl;


import edu.epam.firsttask.parser.StringParser;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class StringParserImpl implements StringParser {
    static Logger logger = LogManager.getLogger(StringParserImpl.class);
    public static final String REGEX_DELIMITER = "\\s+";

    @Override
    public List<String> separateLine(String line) {
        line = line.trim();
        return Arrays.stream(line.split(REGEX_DELIMITER))
                .toList();
    }
}
