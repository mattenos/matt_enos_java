package com.company;

import com.company.interfaces.Converter;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter converterSwitch = new ConverterSwitch();

        Converter converterIf = new ConverterIf();

        converterIf.convertMonth(3);
//        System.out.println("Wow, it's already March");
        converterIf.convertDay(4);
//        System.out.println("Wow, it's already Thursday");

        converterSwitch.convertMonth(10);
//        System.out.println("Wow its October");
        converterSwitch.convertDay(6);
//        System.out.println("Cool, Saturday!");
    }
}