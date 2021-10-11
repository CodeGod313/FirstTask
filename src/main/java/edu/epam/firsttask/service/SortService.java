package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.InvalidArrayIndexException;

public interface SortService {
    void quickSort(CustomArray customArray, int leftBorder, int rightBorder) throws InvalidArrayIndexException;
    void bubbleSort(CustomArray customArray) throws InvalidArrayIndexException;
    void selectionSort(CustomArray customArray) throws InvalidArrayIndexException;
}
