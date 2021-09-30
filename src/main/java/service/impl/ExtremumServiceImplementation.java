package service.impl;

import entity.CustomArray;
import service.ExtremumService;

public class ExtremumServiceImplementation implements ExtremumService {
    @Override
    public Double getMin(CustomArray customArray) {
        Double min = customArray.getByIndex(0);
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) < min){
                min = customArray.getByIndex(i);
            }
        }
        return min;
    }

    @Override
    public Double getMax(CustomArray customArray) {
        Double max = customArray.getByIndex(0);
        for(int i = 0; i<customArray.size(); i++){
            if(customArray.getByIndex(i) > max){
                max = customArray.getByIndex(i);
            }
        }
        return max;
    }
}
