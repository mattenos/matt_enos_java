package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {
    public String convertMonth(int monthNumber) {

        String newMonth;

        switch (monthNumber) {
            case 1:
                newMonth = "January";
                break;
            case 2:
                newMonth = "February";
                break;
            case 3:
                newMonth = "March";
                break;
            case 4:
                newMonth = "April";
                break;
            case 5:
                newMonth = "May";
                break;
            case 6:
                newMonth = "June";
                break;
            case 7:
                newMonth = "July";
                break;
            case 8:
                newMonth = "August";
                break;
            case 9:
                newMonth = "September";
                break;
            case 10:
                newMonth = "October";
                break;
            case 11:
                newMonth = "November";
                break;
            case 12:
                newMonth = "December";
                break;
            default:
                newMonth = "invalid entry";
        }
        return newMonth;
    }


    @Override
    public String convertDay(int dayNumber) {
        String newDay;

        switch (dayNumber) {
            case 1:
                newDay = "Monday";
                break;
            case 2:
                newDay = "Tuesday";
                break;
            case 3:
                newDay = "Wednesday";

                break;
            case 4:
                newDay = "Thursday";

                break;
            case 5:
                newDay = "Friday";

                break;
            case 6:
                newDay = "Saturday";

                break;
            case 7:
                newDay = "Sunday";

                break;
            default:
                newDay = "Invalid";

        }
        return newDay;
    }
}