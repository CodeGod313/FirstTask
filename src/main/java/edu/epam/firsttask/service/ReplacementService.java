package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;
import edu.epam.firsttask.functional.CustomComparable;

public interface ReplacementService {
    void replaceTo(CustomArray customArray, CustomComparable customComparable, Double number) throws InvalidArrayIndexException;
}
