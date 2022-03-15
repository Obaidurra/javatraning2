package com.triangla.basic2;

public class IfElse1 {
    public static void main(String[] args) {

        int a = 50;
        int b = 30;
        int c = 60;

        if ((c > a) && (b > c)) {
            System.out.println("this is a");
            System.out.println("This is b");

        } else if (a > b) {
            System.out.println("This is o");

        } else if (a == b) {
            System.out.println("This is c");

        } else {
            System.out.println("this is d");
        }
    }
}
