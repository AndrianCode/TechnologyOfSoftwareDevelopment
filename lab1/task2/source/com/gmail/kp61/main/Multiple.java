package com.gmail.kp61.main;

import com.gmail.kp61.consoleHelpers.ArrayReader;
import com.gmail.kp61.dataStructures.SpecialArray;

import java.io.IOException;
import java.util.Arrays;

public class Multiple {
    public static void main(String[] args) {

        System.out.println("Enter values of array in line: ");

        try {
            ArrayReader arrReader = new ArrayReader();
            SpecialArray array = new SpecialArray(arrReader.readArrayFromConsole());

            System.out.println("Entered array: " + array.toString());

            System.out.println("Numbers which are divisible by 5: " +
                    Arrays.toString(array.findModNumbers(5)));
            System.out.println("Numbers which are divisible by 10: " +
                    Arrays.toString(array.findModNumbers(10)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}