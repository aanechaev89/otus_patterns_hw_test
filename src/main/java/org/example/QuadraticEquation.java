package org.example;

public class QuadraticEquation {
    public static final double epsilon = 0.000001d;

    public static double[] squareRoot(double a, double b, double c){
        if (!(Math.abs(a) < epsilon)) {
            if (Double.isFinite(a) && Double.isFinite(b) && Double.isFinite(c)) {
                double D = Math.pow(b, 2) - 4 * a * c;
                if (D > epsilon) {
                    return new double[]{(-b + Math.sqrt(D)) / (2 * a), ((-b - Math.sqrt(D)) / (2 * a))};
                } else if (Math.abs(D) < epsilon) {
                    return new double[]{-b / (2 * a)};

                } else {
                    return new double[]{};
                }
            } else {
                throw new RuntimeException("a, b и c не могут принимать значения, отличные от чисел");
            }
        } else {
            throw new RuntimeException("a не равно 0");
        }
    }
}
