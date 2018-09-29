package com.gmail.maxsmv1998.main;

import com.gmail.maxsmv1998.dataStructures.SpecialArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Enter values of array in line: ");

        try {

            SpecialArray array = new SpecialArray(initArray());
            System.out.println("Entered array: " + array.toString());

            System.out.println("Numbers which are divisible by 5: " +
                    Arrays.toString(array.findModNumbers(5)));
            System.out.println("Numbers which are divisible by 10: " +
                    Arrays.toString(array.findModNumbers(10)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] initArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();

        if (lines.length() == 0)
            throw new Error("Array is empty");

        String[] strs = lines.trim().split("\\s+");
        int[] data = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            data[i] = Integer.parseInt(strs[i]);
        }
        return data;
    }
}