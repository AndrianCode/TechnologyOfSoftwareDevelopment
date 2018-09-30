package com.gmail.kp61.dataStructures;

import java.util.Arrays;
import java.util.Comparator;

public class StringContainer {
    private String[] strings;

    public StringContainer(String[] strings) {
        this.strings = strings;
    }

    /**
     * The sort method
     *
     * @return sorted array
     */

    public String [] sort() {
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        return strings;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            result.append(String.format("String[%d]: %s, Length: %d\n", i, strings[i], strings[i].length()));
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringContainer that = (StringContainer) o;
        return Arrays.equals(strings, that.strings);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(strings);
    }
}
