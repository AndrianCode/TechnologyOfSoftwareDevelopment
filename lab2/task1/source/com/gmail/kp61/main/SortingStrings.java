package com.gmail.kp61.main;

import com.gmail.kp61.dataStructures.StringContainer;
import com.gmail.kp61.staff.Developer;

public class SortingStrings {
        public static void main(String[] args) {
                Developer developer = new Developer("Andrian Poyda");
                developer.assignTask("Sort and output strings in order of increasing their length.");

                StringContainer strCont = new StringContainer(args);
                System.out.print("Input strings before sorting:\n" + strCont);
                strCont.sort();
                System.out.print("Strings in order of increasing their length:\n" + strCont);
                System.out.print("Lengths of strings:\n" + strCont.getStringsLength());

                System.out.println("Developer: " + developer.getFullName());
                System.out.println("Task: " + developer.getCurrentTask());
                developer.doneTask();
                System.out.println("Date of receipt of the assignment: " + developer.getAssignTaskDate());
                System.out.println("End date of the assignment: " + developer.getDoneTaskDate());
        }
}
