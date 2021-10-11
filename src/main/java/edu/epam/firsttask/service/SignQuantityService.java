package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;


public interface SignQuantityService {
    Integer calculatePositivesQuantity(CustomArray customArray) throws EmptyArrayException;
    Integer calculateNegativesQuantity(CustomArray customArray) throws EmptyArrayException;
}
