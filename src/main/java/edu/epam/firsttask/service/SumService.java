package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;

public interface SumService {
    Double calculateSum(CustomArray customArray) throws InvalidArrayIndexException;
}
