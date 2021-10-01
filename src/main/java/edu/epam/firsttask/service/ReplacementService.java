package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.functional.Comparable;

public interface ReplacementService {
    void replaceTo(CustomArray customArray, Comparable comparable, Double number) throws EmptyArrayException;
}
