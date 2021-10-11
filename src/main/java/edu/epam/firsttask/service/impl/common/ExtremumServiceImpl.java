package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.ExtremumService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ExtremumServiceImpl implements ExtremumService {
    static Logger logger = LogManager.getLogger(AverageServiceImpl.class);

    @Override
    public Double calculateMin(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not get the minimum, array is empty");
        Double min = customArray.getByIndex(0);
        for (int i = 0; i < customArray.size(); i++) {
            if (customArray.getByIndex(i) < min) {
                min = customArray.getByIndex(i);
            }
        }
        return min;
    }

    @Override
    public Double calculateMax(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not get the maximum, array is empty");
        Double max = customArray.getByIndex(0);
        for (int i = 0; i < customArray.size(); i++) {
            if (customArray.getByIndex(i) > max) {
                max = customArray.getByIndex(i);
            }
        }
        return max;
    }
}
