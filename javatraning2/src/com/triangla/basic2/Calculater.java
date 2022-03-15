package com.triangla.basic2;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        String calculator = "Welcome Calculater";
        System.out.println(" My New calculator");
        Scanner input = new Scanner(System.in);
        String number = "Please enter a Whole Number";
        System.out.println(number);
        double enterNumber1 = input.nextDouble();
        String another = "Enter Another Number";
        System.out.println(another);
        double enterNumber2 = input.nextDouble();
        double addition = enterNumber1 + enterNumber2;
        System.out.println("Total Calculater was = "+ addition);

    }

}
