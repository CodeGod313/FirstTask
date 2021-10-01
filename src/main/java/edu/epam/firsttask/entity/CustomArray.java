package edu.epam.firsttask.entity;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;


public class CustomArray {
    static Logger logger = LogManager.getLogger(CustomArray.class);
    private Double[] doubleArray;

    public CustomArray(List<Double> doubleList) {
        this.doubleArray = doubleList.toArray(Double[]::new);
    }

    public Double[] getDoubleArray() {
        return Arrays.copyOf(doubleArray, doubleArray.length);
    }

    public void setDoubleArray(Double[] doubleArray) {
        this.doubleArray = doubleArray;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(doubleArray, that.doubleArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(doubleArray);
    }
}
