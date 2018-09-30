package com.gmail.kp61.dataStructures;

import java.util.Arrays;
import java.util.Comparator;

public class StringContainer {
    private String[] strings;

    public StringContainer(String[] strings) {
        this.strings = strings;
    }

    /**
     * Sorting array in order of increasing strings length
     */

    public void sort() {
        Arrays.sort(strings, Comparator.comparingInt(String::length));
    }

    /**
     * @return the result of calling toString for a non-null object
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            result.append(String.format("String[%d]: %s, Length: %d\n", i, strings[i], strings[i].length()));
        }
        return result.toString();
    }

    /**
     * @param obj an object to be compared with current object for equality
     * @return true if the objects are equal to each other and false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StringContainer that = (StringContainer) obj;
        return Arrays.equals(strings, that.strings);
    }

    /**
     * @return the hash code of a non-null object and 0 for a null argument.
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(strings);
    }
}
