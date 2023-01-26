package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
//
        Double length = input.nextDouble();
        while (length < 0){
            System.out.println("You cannot calculate radius < 0. Enter another number");
            length = input.nextDouble();
        }
        System.out.println(length + " is a valid number");

        double pi = 3.14;
        Double area = Circle.getArea(length);
        while (area.isNaN()) {
            System.out.println("This is nat a vaild number. Try Again");
            length = input.nextDouble();
        }
        System.out.println("The Area of the Circle is: " + Circle.getArea(length));


    }
}
