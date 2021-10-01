package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;

public interface ExtremumService {
    Double getMin(CustomArray customArray) throws EmptyArrayException;
    Double getMax(CustomArray customArray) throws EmptyArrayException;
}
