package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;

import java.util.OptionalDouble;

public interface AverageService {
    OptionalDouble calculateAverage(CustomArray customArray) throws InvalidArrayIndexException;
}
