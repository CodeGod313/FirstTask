package service.impl;

import entity.CustomArray;
import functional.Comparable;
import service.ReplacementService;

public class ReplacementServiceImplementation implements ReplacementService {
    @Override
    public void replaceTo(CustomArray customArray, Comparable comparable, Double number) {
        for(int i = 0; i<customArray.size(); i++){
            if(comparable.compareDouble(customArray.getByIndex(i))){
                customArray.setByIndex(i, number);
            }
        }
    }
}