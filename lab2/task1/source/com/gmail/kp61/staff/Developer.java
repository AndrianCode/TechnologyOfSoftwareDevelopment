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
     * @return date of received task
     */
    public String assignTask(String task) {
        currentTask = task;
        Date date = new Date(System.currentTimeMillis() - 1000000);
        return "Date of receipt of the assignment:" + date.toString();
    }

    /**
     * Method to finish task
     *
     * @return date of finished task
     */
    public String doneTask() {
        if (currentTask == null)
            return "com.gmail.kp61.main.staff.Developer does not have the current task!";

        Date date = new Date();
        return "End date of the assignment:" + date.toString();
    }

    @Override
    public String toString() {
        return "com.gmail.kp61.main.staff.Developer{" +
                "fullName='" + fullName + '\'' +
                ", currentTask='" + currentTask + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(fullName, developer.fullName) &&
                Objects.equals(currentTask, developer.currentTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, currentTask);
    }
}
