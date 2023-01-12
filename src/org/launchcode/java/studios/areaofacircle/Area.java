package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double length = input.nextInt();
        double pi = 3.14;
//        double area = (double) (pi * (length * length));
        System.out.println("The Area of the Circle is: " + Circle.getArea(length));
    }
}
