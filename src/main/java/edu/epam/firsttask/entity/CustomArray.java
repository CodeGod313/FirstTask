package edu.epam.firsttask.entity;

import edu.epam.firsttask.exception.InvalidArrayIndexException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;


public class CustomArray {
    static Logger logger = LogManager.getLogger(CustomArray.class);
    private Double[] doubleArray;

    public CustomArray(List<Double> doubleList) {
        if (doubleList == null) {
            this.doubleArray = new Double[0];
        } else {
            this.doubleArray = doubleList.toArray(Double[]::new);
        }
    }

    public CustomArray(Double[] doubleArray) {
        this.doubleArray = doubleArray.clone();
    }

    public Double[] getDoubleArray() {
        return Arrays.copyOf(doubleArray, doubleArray.length);
    }

    public void setDoubleArray(Double[] doubleArray) {
        this.doubleArray = doubleArray.clone();
    }

    public Double getByIndex(int index) throws InvalidArrayIndexException {
        if (index > size() - 1 || index < 0) {
            throw new InvalidArrayIndexException("Invalid index");
        }
        return doubleArray[index];
    }

    public void setByIndex(int index, Double number) throws InvalidArrayIndexException {
        if (index > size() - 1 || index < 0) {
            throw new InvalidArrayIndexException("Invalid index");
        }
        doubleArray[index] = number;
    }

    public int size() {
        return doubleArray.length;
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

    @Override
    public String toString() {
        return "CustomArray{" +
                "doubleArray=" + Arrays.toString(doubleArray) +
                '}';
    }
}
