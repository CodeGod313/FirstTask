package edu.epam.firsttask.factory.impl;



import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.factory.CustomArrayFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

public class CustomArrayFactoryImpl implements CustomArrayFactory {
    static Logger logger = LogManager.getLogger(CustomArrayFactoryImpl.class);
    @Override
    public CustomArray getCustomArrayFromStrings(List<String> strings) {
        List<Double> doubleList =  strings.stream()
                .map(Double::parseDouble)
                .toList();
        logger.info("");
        return new CustomArray(doubleList);
    }
}
