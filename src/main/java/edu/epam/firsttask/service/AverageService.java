package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;

public interface AverageService {
    Double getAverage(CustomArray customArray) throws EmptyArrayException;
}
