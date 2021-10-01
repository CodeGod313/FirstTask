package edu.epam.firsttask.service.impl;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.AverageService;

public class AverageServiceImplementation implements AverageService {
    @Override
    public Double getAverage(CustomArray customArray) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not count the average, array is empty");
        Double sum = 0.;
        for(int i = 0; i<customArray.size(); i++){
            sum+=customArray.getByIndex(i);
        }
        return sum / customArray.size();
    }
}
