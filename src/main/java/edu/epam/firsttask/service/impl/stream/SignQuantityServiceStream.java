package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.service.SignQuantityService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class SignQuantityServiceStream implements SignQuantityService {
    static Logger logger = LogManager.getLogger(SignQuantityServiceStream.class);

    @Override
    public Integer calculatePositivesQuantity(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getDoubleArray())
                .filter(x -> x > 0)
                .count();
    }

    @Override
    public Integer calculateNegativesQuantity(CustomArray customArray) {
        return (int) Arrays.stream(customArray.getDoubleArray())
                .filter(x -> x < 0)
                .count();
    }
}
