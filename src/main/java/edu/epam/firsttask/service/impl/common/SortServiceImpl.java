package edu.epam.firsttask.service.impl.common;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SortService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SortServiceImpl implements SortService {
    static Logger logger = LogManager.getLogger(SortServiceImpl.class);

    @Override
    public void quickSort(CustomArray customArray, int leftBorder, int rightBorder) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not sort, array is empty");
        if (rightBorder <= leftBorder) {
            return;
        }
        int i = leftBorder;
        int j = rightBorder;
        Double pivot = customArray.getByIndex((i + j) / 2);
        while (i <= j) {
            while (customArray.getByIndex(i) < pivot)
                i++;
            while (customArray.getByIndex(j) > pivot)
                j--;
            if (i <= j) {
                swap(customArray, i++, j--);
            }
        }
        if (j > leftBorder)
            quickSort(customArray, leftBorder, j);
        if (i < rightBorder)
            quickSort(customArray, i, rightBorder);
    }

    @Override
    public void bubbleSort(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not sort, array is empty");
        boolean runSort = true;
        while (runSort) {
            runSort = false;
            for (int i = 1; i < customArray.size(); i++) {
                if (customArray.getByIndex(i) < customArray.getByIndex(i - 1)) {
                    swap(customArray, i, i - 1);
                    runSort = true;
                }
            }
        }
    }

    @Override
    public void selectionSort(CustomArray customArray) throws EmptyArrayException {
        if (customArray.isEmpty())
            throw new EmptyArrayException("Can not sort, array is empty");
        for (int i = 0; i < customArray.size(); i++) {
            int minInd = i;
            for (int j = i + 1; j < customArray.size(); j++) {
                if (customArray.getByIndex(minInd) > customArray.getByIndex(j)) {
                    minInd = j;
                }
            }
            swap(customArray, minInd, i);
        }
    }

    private void swap(CustomArray customArray, int index1, int index2) {
        Double tmp = customArray.getByIndex(index1);
        customArray.setByIndex(index1, customArray.getByIndex(index2));
        customArray.setByIndex(index2, tmp);
    }
}
