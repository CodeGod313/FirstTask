package edu.epam.firsttask.service.impl;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.ExtremumService;

public class ExtremumServiceImpl implements ExtremumService {
    @Override
    public Double getMin(CustomArray customArray) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not get the minimum, array is empty");
        Double min = customArray.getByIndex(0);
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) < min){
                min = customArray.getByIndex(i);
            }
        }
        return min;
    }

    @Override
    public Double getMax(CustomArray customArray) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not get the maximum, array is empty");
        Double max = customArray.getByIndex(0);
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) > max){
                max = customArray.getByIndex(i);
            }
        }
        return max;
    }
}
