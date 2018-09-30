package com.gmail.kp61.main;

import com.gmail.kp61.dataStructures.SmartArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SmartArray smArr = new SmartArray(new int[]{1, 0, -3, 0, -5, -6, 2, 0});
        System.out.println("Product of array elements with even numbers: " +
                smArr.multiplOfElmtsWithEvenIndices());
        System.out.println("The sum of array elements located between the first " +
                "and last zero elements: " + smArr.sumBtwFirstAndLastZero());
        System.out.println("Sorted array (all positive elements " +
                "are first located, then all negative ones): " +
                Arrays.toString(smArr.sortPositiveAndNegativeElmts()));
    }
}