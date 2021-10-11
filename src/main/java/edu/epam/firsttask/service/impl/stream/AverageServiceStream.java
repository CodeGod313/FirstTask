package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.AverageService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class AverageServiceStream implements AverageService {
    static Logger logger = LogManager.getLogger(AverageServiceStream.class);

    @Override
    public Double calculateAverage(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not count the average, array is empty");
        return Arrays.stream(customArray.getDoubleArray())
                .mapToDouble(x -> x)
                .average()
                .getAsDouble();
    }
}
