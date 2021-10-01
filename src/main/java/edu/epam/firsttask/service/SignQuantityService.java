package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;


public interface SignQuantityService {
    int getPositivesQuantity(CustomArray customArray) throws EmptyArrayException;
    int getNegativesQuantity(CustomArray customArray) throws EmptyArrayException;
}
