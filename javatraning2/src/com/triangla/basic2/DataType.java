package com.triangla.basic2;

import java.sql.SQLOutput;
import java.util.Date;

     public class DataType {
    public static void main(String[] args) {
        //byte a =12;
        //System.out.println(a);
        String firstName = "Md";
        String lastName = "Rahman";
        String email = "obaidqa@gmail.com";
        String password = "Orahman82";
        String phoneNumber = "347 257 1897";
        System.out.println(  firstName  +  lastName  +  email+ password+   phoneNumber);
        Date now = new Date();
        System.out.println(now);
        String message  = "Hallo brother "+ "% %";
        System.out.println( message.length());







    }
}
