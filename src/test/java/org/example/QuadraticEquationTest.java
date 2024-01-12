package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;

public class QuadraticEquationTest {

    @Test
    public void noRoot() {
        //Arrange
        double a = 1;
        double b = 0;
        double c = 1;

        //Act
        double[] res = QuadraticEquation.squareRoot(a,b,c);

        //Assert
        assertArrayEquals("x^2 + 1 = 0",
                new double[]{},
                res, QuadraticEquation.epsilon);

    }

    @Test
    public void twoRoot() {
        //Arrange
        double a = 1;
        double b = 0;
        double c = -1;

        //Act
        double[] res = QuadraticEquation.squareRoot(a,b,c);

        //Assert
        assertArrayEquals("x^2 - 1 = 0",
                new double[]{1.0,-1.0},
                res, QuadraticEquation.epsilon);

    }

    @Test
    public void oneRoot() {
        //Arrange
        double a = 1;
        double b = 2 + QuadraticEquation.epsilon / 10;
        double c = 1;

        //Act
        double[] res = QuadraticEquation.squareRoot(a,b,c);

        //Assert
        assertArrayEquals("x^2 + 2 * x + 1 = 0",
                new double[]{-1.0},
                res, QuadraticEquation.epsilon);

    }

    @Test
    public void exceptionParam() {
        //Arrange
        double a = Double.NaN;
        double b = Double.POSITIVE_INFINITY;
        double c = Double.NEGATIVE_INFINITY;
        String expectedMessage = "a, b и c не могут принимать значения, отличные от чисел";

        //Act
        Exception excp = assertThrows(Exception.class, () -> {
            double[] res = QuadraticEquation.squareRoot(a,b,c);
        });
        String actualMessage = excp.getMessage();

        //Assert
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void exceptionRoot() {
        //Arrange
        double a = 0.0000001d;
        double b = 0;
        double c = 1;
        String expectedMessage = "a не равно 0";

        //Act
        Exception excp = assertThrows(Exception.class, () -> {
            double[] res = QuadraticEquation.squareRoot(a,b,c);
        });
        String actualMessage = excp.getMessage();

        //Assert
        assertTrue(actualMessage.contains(expectedMessage));

    }
}