package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner in = new Scanner(System.in);
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;

        System.out.print("How many inches?: ");
        inch = in.nextInt();

        cm = inch * CM_PER_INCH;
        System.out.println(inch + " in = " + cm + " cm");

        System.out.print("How many cm?: ");
        cm = in.nextInt();

        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%.2f cm = %d in\n", cm, inch);
    }
}
