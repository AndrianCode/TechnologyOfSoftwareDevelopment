package com.gmail.maxsmv1998.consoleHelpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReader {

    public int[] readArrayFromConsole() throws IOException {
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
