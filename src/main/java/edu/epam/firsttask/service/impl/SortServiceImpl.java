package edu.epam.firsttask.service.impl;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SortService;

public class SortServiceImpl implements SortService {
    @Override
    public void quickSort(CustomArray customArray, int leftBorder, int rightBorder) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not sort, array is empty");
        if(rightBorder <= leftBorder){
            return;
        }
        int j = partition(customArray, leftBorder, rightBorder);
        quickSort(customArray, leftBorder, j-1);
        quickSort(customArray, j+1, rightBorder);

    }

    private int partition(CustomArray customArray, int left, int right){
        int i = left;
        int j = right + 1;
        while (true){
            while (customArray.getByIndex(++i) < customArray.getByIndex(left)){
                if(i == right) break;
            }
            while (customArray.getByIndex(--j) > customArray.getByIndex(left)){
                if(j == left) break;
            }
            if(i >= j) break;
            swap(customArray,i,j);
        }
        swap(customArray,left,j);
        return j;
    }

    @Override
    public void bubbleSort(CustomArray customArray) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not sort, array is empty");
        boolean runSort = true;
        while (runSort) {
            runSort = false;
            for (int i = 1; i < customArray.size(); i++) {
                if (customArray.getByIndex(i) < customArray.getByIndex(i - 1)) {
                    swap(customArray, i, i-1);
                    runSort = true;
                }
            }
        }
    }

    @Override
    public void selectionSort(CustomArray customArray) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not sort, array is empty");
        for (int i = 0; i < customArray.size(); i++) {
            int minInd = i;
            for (int j = i; j < customArray.size(); j++) {
                if (customArray.getByIndex(minInd) > customArray.getByIndex(i)) {
                    minInd = j;
                }
            }
            swap(customArray, minInd, i);
        }
    }

    private void swap(CustomArray customArray, int index1, int index2){
        Double tmp = customArray.getByIndex(index1);
        customArray.setByIndex(index1, customArray.getByIndex(index2));
        customArray.setByIndex(index2, tmp);
    }
}
