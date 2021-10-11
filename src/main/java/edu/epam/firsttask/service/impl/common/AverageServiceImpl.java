package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.AverageService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.OptionalDouble;

public class AverageServiceImpl implements AverageService {
    static Logger logger = LogManager.getLogger(AverageServiceImpl.class);

    @Override
    public OptionalDouble calculateAverage(CustomArray customArray) throws InvalidArrayIndexException {
        if(customArray.size() == 0){
            return OptionalDouble.empty();
        }
        Double sum = 0.;
        for (int i = 0; i < customArray.size(); i++) {
            sum += customArray.getByIndex(i);
        }
        return OptionalDouble.of(sum / customArray.size());
    }
}
