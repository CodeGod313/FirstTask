package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.service.SumService;

import java.util.Arrays;

public class SumServiceStream implements SumService {
    @Override
    public Double calculateSum(CustomArray customArray) {
        return Arrays.stream(customArray.getDoubleArray())
                .reduce(0., Double::sum);
    }
}
