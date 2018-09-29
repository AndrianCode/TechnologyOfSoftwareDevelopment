package com.gmail.maxsmv1998.firstPackage;

import com.gmail.maxsmv1998.secondPackage.Man;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        Man student = new Man(name);

        JOptionPane.showMessageDialog(null, student.sayHello());
        System.exit(0);
    }
}

