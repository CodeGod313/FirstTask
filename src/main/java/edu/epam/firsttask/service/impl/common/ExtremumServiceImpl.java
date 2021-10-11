package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.ExtremumService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.OptionalDouble;

public class ExtremumServiceImpl implements ExtremumService {
    static Logger logger = LogManager.getLogger(AverageServiceImpl.class);

    @Override
    public OptionalDouble calculateMin(CustomArray customArray) throws InvalidArrayIndexException {
        if (customArray.size() == 0) {
            return OptionalDouble.empty();
        }
        Double min = customArray.getByIndex(0);
        for (int i = 0; i < customArray.size(); i++) {
            if (customArray.getByIndex(i) < min) {
                min = customArray.getByIndex(i);
            }
        }
        return OptionalDouble.of(min);
    }

    @Override
    public OptionalDouble calculateMax(CustomArray customArray) throws InvalidArrayIndexException {
        if (customArray.size() == 0) {
            return OptionalDouble.empty();
        }
        Double max = customArray.getByIndex(0);
        for (int i = 0; i < customArray.size(); i++) {
            if (customArray.getByIndex(i) > max) {
                max = customArray.getByIndex(i);
            }
        }
        return OptionalDouble.of(max);
    }
}
