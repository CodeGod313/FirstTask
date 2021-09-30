package service.impl;

import entity.CustomArray;
import service.AverageService;

public class AverageServiceImplementation implements AverageService {
    @Override
    public Double getAverage(CustomArray customArray) {
        Double sum = 0.;
        for(int i = 0; i<customArray.size(); i++){
            sum+=customArray.getByIndex(i);
        }
        return sum / customArray.size();
    }
}
