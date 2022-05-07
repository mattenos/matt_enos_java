package com.company;

public class Calculator {
    public static void main(String[] args) {
        DoubleMath doubleMath = new DoubleMath();
        IntegerMath integerMath = new IntegerMath();

        IntegerMath.add(1, 1);
        IntegerMath.subtract(23,52);
        IntegerMath.multiply(34,2);
        IntegerMath.divide(12, 3);
        IntegerMath.divide(12,7);

        DoubleMath.add(3.4,2.3);
        DoubleMath.multiply(6.7,4.4);
        DoubleMath.subtract(5.5,0.5);
        DoubleMath.divide(10.8,2.2);

    }
}

