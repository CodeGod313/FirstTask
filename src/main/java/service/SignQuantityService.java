package service;

import entity.CustomArray;


public interface SignQuantityService {
    int getPositivesQuantity(CustomArray customArray);
    int getNegativesQuantity(CustomArray customArray);
}
