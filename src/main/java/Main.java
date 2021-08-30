/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        double Rate = 0.055;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String Str1 = input.nextLine();
        System.out.print("What is the state? ");
        String Str2 = input.nextLine();
        //Convert string to lowercase so case doesn't matter
        String Lower_Str2=Str2.toLowerCase();
        double Subtotal = Double.parseDouble(Str1);
        double Cost=Subtotal;
        if(Lower_Str2.equals("wi"))
            Cost=Subtotal*(1+Rate);
        Cost=Math.round(Cost*100.0)/100.0;
        System.out.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.",
                Subtotal,Cost-Subtotal,Cost);
    }
}