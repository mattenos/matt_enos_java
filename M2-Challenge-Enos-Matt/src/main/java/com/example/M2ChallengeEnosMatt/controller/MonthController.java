package com.example.M2ChallengeEnosMatt.controller;

import com.example.M2ChallengeEnosMatt.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/month")
public class MonthController {
    @GetMapping(value="/{monthNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public String getMonth(@PathVariable String monthNumber) {

        switch (monthNumber) {
            case "1":
                return "January";
            case "2":
                return "February";
            case "3":
                return "March";
            case "4":
                return "April";
            case "5":
                return "May";
            case "6":
                return "June";
            case "7":
                return "July";
            case "8":
                return "August";
            case "9":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
            default:
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number Specified");
        }
    }

//    @GetMapping(value = "/randomMonth")
//    @ResponseStatus(value = HttpStatus.OK)
//    public String getRandomMonth(@PathVariable String monthNumber){
//        Month randomMonth = new Month();
//        int randomInt = randomMonth.;
//        int correctInt = randomInt + 1;
//        System.out.println(correctInt);
//
//        for (int i = 0; i < 11; i++) {
//            System.out.print((rand.nextInt(11) + 1) + " " );
//        }
//
//    }

}
