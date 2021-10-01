package edu.epam.firsttask.service.impl;

import edu.epam.firsttask.entity.CustomArray;
import edu.epam.firsttask.exception.EmptyArrayException;
import edu.epam.firsttask.service.SignQuantityService;

public class SignQuantityServiceImplementation implements SignQuantityService {
    @Override
    public int getPositivesQuantity(CustomArray customArray) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not count the quantity, array is empty");
        int quantity = 0;
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) > 0){
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int getNegativesQuantity(CustomArray customArray) throws EmptyArrayException {
        if(customArray.isEmpty())
            throw new EmptyArrayException("Can not count the quantity, array is empty");
        int quantity = 0;
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) < 0){
                quantity++;
            }
        }
        return quantity;
    }
}
