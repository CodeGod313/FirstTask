package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.AverageService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AverageServiceImpl implements AverageService {
    static Logger logger = LogManager.getLogger(AverageServiceImpl.class);

    @Override
    public Double calculateAverage(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not count the average, array is empty");
        Double sum = 0.;
        for (int i = 0; i < customArray.size(); i++) {
            sum += customArray.getByIndex(i);
        }
        return sum / customArray.size();
    }
}
