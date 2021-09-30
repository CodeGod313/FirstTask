package service.impl;

import entity.CustomArray;
import service.SumService;

public class SumServiceImplementation implements SumService {
    @Override
    public Double getSum(CustomArray customArray) {
        Double sum = 0.;
        for(int i = 0; i<customArray.size(); i++){
            sum += customArray.getByIndex(i);
        }
        return sum;
    }
}
