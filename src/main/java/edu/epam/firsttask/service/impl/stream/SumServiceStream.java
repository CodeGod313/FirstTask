package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SumService;

import java.util.Arrays;

public class SumServiceStream implements SumService {
    @Override
    public Double getSum(CustomArray customArray) throws EmptyArrayException {
        return Arrays.stream(customArray.getDoubleArray())
                .reduce((x,y)->x+y)
                .get()
                .doubleValue();
    }
}
