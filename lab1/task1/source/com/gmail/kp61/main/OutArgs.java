package com.gmail.kp61.main;

import com.gmail.kp61.dataStructures.Arguments;

public class OutArgs {
    public static void main(String[] args) {
        Arguments arguments = new Arguments(args);
        System.out.print(arguments.toString());
    }
}

