package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.ExtremumService;

import java.util.Arrays;

public class ExtremumServiceStream implements ExtremumService {
    @Override
    public Double calculateMin(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not count minimum, array is empty");
        return Arrays.stream(customArray.getDoubleArray())
                .mapToDouble(x -> x)
                .min()
                .getAsDouble();
    }

    @Override
    public Double calculateMax(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not count maximum, array is empty");
        return Arrays.stream(customArray.getDoubleArray())
                .mapToDouble(x -> x)
                .max()
                .getAsDouble();
    }
}
