package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;

public interface SortService {
    void quickSort(CustomArray customArray, int leftBorder, int rightBorder) throws EmptyArrayException;
    void bubbleSort(CustomArray customArray) throws EmptyArrayException;
    void selectionSort(CustomArray customArray) throws EmptyArrayException;
}
