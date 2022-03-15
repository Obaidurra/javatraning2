package com.triangla.basic2;

public class Switch2 {
    public static void main(String[] args) {
double price = 50;
double discount = 0;
String coundition = "used";
switch (coundition){
    case ("damege"):
        discount = price*0.1;
        System.out.println(discount);
        break;
    case ("used"):
        discount = price+2.5;
        System.out.println(discount);
    default:
        System.out.println(discount );
}




    }
}
