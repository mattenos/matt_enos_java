package com.company;

public class Calculator {
    public static void main(String[] args) {
        DoubleMath doubleMath = new DoubleMath();
        IntegerMath integerMath = new IntegerMath();

//        IntegerMath.add(1, 1);
        System.out.println("1 + 1 = " + IntegerMath.add(1,1));

//        IntegerMath.subtract(23,52);
        System.out.println("23 - 52 = " + IntegerMath.subtract(23,52));

//        IntegerMath.multiply(34,2);
        System.out.println("34 * 2 = " + IntegerMath.multiply(34,2));

//        IntegerMath.divide(12, 3);
        System.out.println("12 / 3 = " + IntegerMath.divide(12,3));

//        IntegerMath.divide(12,7);
        System.out.println("12 / 7 = " + IntegerMath.divide(12,7) + " with a remainder of 5");


//        DoubleMath.add(3.4,2.3);
        System.out.println("3.4 + 2.3 = " + doubleMath.add(3.4, 2.3));

//        DoubleMath.multiply(6.7,4.4);
        System.out.println("6.7 * 4.4 = " + doubleMath.multiply(6.7, 4.4));

//        DoubleMath.subtract(5.5,0.5);
        System.out.println("5.5 - 0.5 = " + doubleMath.subtract(5.5, 0.5));

//        DoubleMath.divide(10.8,2.2);
        System.out.println("10.8 / 2.2 = " + doubleMath.divide(10.8, 2.2));


    }
}

