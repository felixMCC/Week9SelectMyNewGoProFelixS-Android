package com.example;

public class MyGoProMainClass {


    public static void main(String [] args){
        System.out.println("Week 9: Select My New GoPro\n\nBy: Nestor (Felix) Sotres\n\nThis program will help" +
                " the user select a recommended GoPro camera based on a series of questions based on activity.\n\n");

        //instantiate class object to help things going
        ChooseGoPro run = new ChooseGoPro();
        //run program
        run.runChooseMyGoPro();
    }
}
