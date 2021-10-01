package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SignQuantityService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class SignQuantityServiceStream implements SignQuantityService {
    static Logger logger = LogManager.getLogger(SignQuantityServiceStream.class);
    @Override
    public int getPositivesQuantity(CustomArray customArray) throws EmptyArrayException {
        return (int) Arrays.stream(customArray.getDoubleArray())
                .filter(x->x>0)
                .count();
    }

    @Override
    public int getNegativesQuantity(CustomArray customArray) throws EmptyArrayException {
        return (int) Arrays.stream(customArray.getDoubleArray())
                .filter(x->x<0)
                .count();
    }
}
