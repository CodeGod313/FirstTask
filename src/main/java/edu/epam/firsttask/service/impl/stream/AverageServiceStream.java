package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.service.AverageService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageServiceStream implements AverageService {
    static Logger logger = LogManager.getLogger(AverageServiceStream.class);

    @Override
    public OptionalDouble calculateAverage(CustomArray customArray) {
        return Arrays.stream(customArray.getDoubleArray())
                .mapToDouble(x -> x)
                .average();
    }
}
