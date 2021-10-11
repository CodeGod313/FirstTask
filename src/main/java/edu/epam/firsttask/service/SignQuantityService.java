package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;


public interface SignQuantityService {
    Integer calculatePositivesQuantity(CustomArray customArray) throws InvalidArrayIndexException;
    Integer calculateNegativesQuantity(CustomArray customArray) throws InvalidArrayIndexException;
}
