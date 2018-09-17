package com.gmail.maxsmv1998.stringsManager;

import java.util.Arrays;

public class Arguments {
    private String[] strs;

    public Arguments(String[] strs) {
        this.strs = strs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Arguments arguments = (Arguments) obj;
        return Arrays.equals(strs, arguments.strs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(strs);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            result += String.format("Argument[%d]: %s\n", i, strs[i]);
        }
        return result;
    }
}
