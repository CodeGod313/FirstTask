package service.impl;

import entity.CustomArray;
import service.SignQuantityService;

public class SignQuantityServiceImplementation implements SignQuantityService {
    @Override
    public int getPositivesQuantity(CustomArray customArray) {
        int quantity = 0;
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) > 0){
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int getNegativesQuantity(CustomArray customArray) {
        int quantity = 0;
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) < 0){
                quantity++;
            }
        }
        return quantity;
    }
}
