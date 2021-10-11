package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;

public interface ExtremumService {
    Double calculateMin(CustomArray customArray) throws EmptyArrayException;
    Double calculateMax(CustomArray customArray) throws EmptyArrayException;
}
