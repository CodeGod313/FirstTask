package edu.epam.firsttask.service.impl.stream;

import edu.epam.firsttask.entity.CustomArray;

import java.util.Arrays;

public class SortServiceStream {
    public void streamSort(CustomArray customArray) {
        Double[] values = customArray.getDoubleArray();
        values = Arrays.stream(values).sorted().toArray(Double[]::new);
        customArray.setDoubleArray(values);
    }
}
