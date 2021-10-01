package edu.epam.firsttask.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;


public class CustomArray {
    static Logger logger = LogManager.getLogger(CustomArray.class);
    private Double[] doubleArray;

    public CustomArray(List<Double> doubleList) {
        this.doubleArray = doubleList.toArray(Double[]::new);
    }

    public Double[] getDoubleArray() {
        return doubleArray;
    }

    public Double getByIndex(int index){
        return doubleArray[index];
    }

    public void setByIndex(int index, Double number) {
        doubleArray[index] = number;
    }

    public int size() {
        return doubleArray.length;
    }

    public boolean isEmpty(){
        return doubleArray.length == 0;
    }
}
