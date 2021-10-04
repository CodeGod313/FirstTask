package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;


public interface SignQuantityService {
    Integer getPositivesQuantity(CustomArray customArray) throws EmptyArrayException;
    Integer getNegativesQuantity(CustomArray customArray) throws EmptyArrayException;
}
