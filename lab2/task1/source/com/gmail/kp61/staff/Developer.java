package com.gmail.kp61.staff;

import java.util.Date;
import java.util.Objects;

public class Developer {
    private String fullName;
    private String currentTask;

    public Developer(String fullName) {
        this.fullName = fullName;
        this.currentTask = null;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCurrentTask() {
        return currentTask;
    }

    /**
     * Method to get task
     *
     * @param task assigned task for developer
     * @return date of received task
     */
    public String assignTask(String task) {
        currentTask = task;
        Date date = new Date(System.currentTimeMillis() - 100000);
        return date.toString();
    }

    /**
     * Method to finish task
     *
     * @return date of finished task or
     * message that the developer does not have the current task
     */
    public String doneTask() {
        if (currentTask == null)
            return "Developer does not have the current task!";

        currentTask = null;

        Date date = new Date();
        return date.toString();
    }


    /**
     * @return the result of calling toString for a non-null object
     * and "null" for a null argument
     */
    @Override
    public String toString() {
        return "Developer{" +
                "fullName='" + fullName + '\'' +
                ", currentTask='" + currentTask + '\'' +
                '}';
    }

    /**
     * @param obj an object to be compared with current object for equality
     * @return true if the objects are equal to each other and false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Developer developer = (Developer) obj;
        return Objects.equals(fullName, developer.fullName) &&
                Objects.equals(currentTask, developer.currentTask);
    }

    /**
     * @return the hash code of a non-null object and 0 for a null argument.
     */
    @Override
    public int hashCode() {
        return Objects.hash(fullName, currentTask);
    }
}
