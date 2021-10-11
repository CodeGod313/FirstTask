package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.service.ExtremumService;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ExtremumServiceStream implements ExtremumService {
    @Override
    public OptionalDouble calculateMin(CustomArray customArray) {
        return Arrays.stream(customArray.getDoubleArray())
                .mapToDouble(x -> x)
                .min();
    }

    @Override
    public OptionalDouble calculateMax(CustomArray customArray) {
        return Arrays.stream(customArray.getDoubleArray())
                .mapToDouble(x -> x)
                .max();
    }
}
