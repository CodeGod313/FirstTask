package entity;

import java.util.List;

public class CustomArray {
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
}
