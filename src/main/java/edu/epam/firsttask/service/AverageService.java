package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;

public interface AverageService {
    Double calculateAverage(CustomArray customArray) throws EmptyArrayException;
}
