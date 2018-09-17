package com.gmail.maxsmv1998.main;

import com.gmail.maxsmv1998.stringsManager.Arguments;

public class OutArgs {
    public static void main(String[] args) {
        Arguments arguments = new Arguments(args);
        System.out.print(arguments.toString());
    }
}

