package com.gmail.kp61.main;

import com.gmail.kp61.dataStructures.StringContainer;
import com.gmail.kp61.staff.Developer;

public class SortingStrings {
    public static void main(String[] args) {
        Developer developer = new Developer("Nadia Chumak");
        String dateOfAssignedTask = developer.assignTask("Sort and output strings in order of increasing their length.");

        StringContainer strCont = new StringContainer(args);
        System.out.print("Input strings before sorting:\n" + strCont);
        strCont.sort();
        System.out.print("Strings in order of increasing their length:\n" + strCont);

        System.out.println("com.gmail.kp61.main.staff.Developer: "+ developer.getFullName());
        System.out.println("Task: " + developer.getCurrentTask());
        System.out.println(dateOfAssignedTask);
        System.out.println(developer.doneTask());
    }
}
