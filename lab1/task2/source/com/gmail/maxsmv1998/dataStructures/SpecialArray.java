package com.gmail.maxsmv1998.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecialArray {
    private int[] data;

    public SpecialArray(int[] data) {
        this.data = data;
    }

    public int[] findModNumbers(int divider) {
        if (data == null)
            throw new Error("Invalid array!");

        ArrayList<Integer> list = new ArrayList<>();

        for (int sourceNumber : data) {
            if (sourceNumber % divider == 0) {
                list.add(sourceNumber);
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SpecialArray arrForComp = (SpecialArray) obj;
        return Arrays.equals(data, arrForComp.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}