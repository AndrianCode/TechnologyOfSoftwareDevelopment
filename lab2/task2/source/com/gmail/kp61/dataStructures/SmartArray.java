package com.gmail.kp61.dataStructures;

import java.util.Arrays;

public class SmartArray {
    private int[] data;

    public SmartArray(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Input array can not be NULL!");
        data = arr;
    }

    public int multiplOfElmtsWithEvenIndices() throws Exception {
        if (data.length == 0)
            throw new Exception("Array can not be empty!");

        int multiple = 1;
        for (int i = 0; i < data.length; i += 2) {
            multiple *= data[i];
        }
        return multiple;
    }

    public int sumBtwFirstAndLastZero() throws Exception {
        if (data.length == 0)
            throw new Exception("Array can not be empty!");

        int sum = 0;
        int firstIndx = 0;
        int lastIndx = data.length - 1;

        while (data[firstIndx] != 0 && firstIndx < data.length - 1)
            firstIndx++;
        while (data[lastIndx] != 0 && lastIndx > 0)
            lastIndx--;

        for (int i = firstIndx; i < lastIndx; i++)
            sum += data[i];

        return sum;
    }

    public int[] sortPositiveAndNegativeElmts() {
        int[] resultArr = new int[data.length];
        int counter = 0;
        for (int value : data)
            if (value >= 0)
                resultArr[counter++] = value;
        for (int value : data)
            if (value < 0)
                resultArr[counter++] = value;
        return resultArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SmartArray arrForComp = (SmartArray) obj;
        return Arrays.equals(data, arrForComp.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}