package org.example;

import java.util.Scanner;
public class Program {
    public static void main(String args[]){
        double a = Double.NaN;
        if (Double.isFinite(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        /*Scanner console = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = console.nextDouble();
        System.out.println("Enter b: ");
        double b = console.nextDouble();
        System.out.println("Enter c: ");
        double c = console.nextDouble();
        double[] res = QuadraticEquation.squareRoot(a,b,c);
        int i;
        int j;
        for (i = 0; i < res.length; i++) {
            j = i + 1;
            System.out.println("Resolve" + j + " = " + res[i]);
        }*/
    }
}
