package com.triangla.basic2;

import java.util.Scanner;

public class IfElaseStatment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String User, Pass;

        System.out.println("Enter My Username");
        User = input.nextLine();

        System.out.println("Enter My Password");
        Pass = input.nextLine();
        if (User.equals("Obaidur") && (Pass.equals("1234"))) {
            System.out.println("Welcome Obaidur");

        }  else {
            System.out.println("this is not me");
        }


        }
    }







