package com.syntexpro;

public class SopingApp {
    public static void main(String[] args) {


        String size = new String("john");
        if (size.equals(size)) {
            System.out.println("true");
        }else {
            System.out.println(false);
        }
            int measurement = 3;
            switch (measurement) {
                case 1:
                    System.out.println("s");
                    break;
                case 2:
                    System.out.println("m");
                    break;
                case 3:
                    System.out.println("l");
                    break;
                default:
                    System.out.println("X");


            }
        }
    }
