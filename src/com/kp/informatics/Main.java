package com.kp.informatics;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    in.useLocale(Locale.US);
    System.out.println("Please, write x");
    double x= in.nextDouble();
        System.out.println("Please, write y");
    double y = in.nextDouble();
    System.out.println(x<2 && y<x && x*x + y*y > 4 && y> 0 ? "Yes" : "No");






    }
}
