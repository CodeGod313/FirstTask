package edu.epam.firsttask.factory.impl;



import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.factory.CustomArrayFactory;

import java.util.List;

public class CustomArrayFactoryImpl implements CustomArrayFactory {
    @Override
    public CustomArray getCustomArrayFromStrings(List<String> strings) {
        List<Double> doubleList =  strings.stream()
                .map(Double::parseDouble)
                .toList();
        return new CustomArray(doubleList);
    }
}
