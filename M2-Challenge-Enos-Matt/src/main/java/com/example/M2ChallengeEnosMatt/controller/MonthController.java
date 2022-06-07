package com.example.M2ChallengeEnosMatt.controller;

import com.example.M2ChallengeEnosMatt.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;

@RestController
@RequestMapping(value = "/month")
public class MonthController {

    @GetMapping(value = "/{monthNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonth(@PathVariable int monthNumber) {

        String name = "no name";

        switch (monthNumber) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;
            default:
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number Specified");
        }
        return new Month(monthNumber, name);
    }

    @GetMapping(value = "/randomMonth")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth() {

        Random rand = new Random();

        int randomInt = rand.nextInt(12) + 1;

        return getMonth(randomInt);

    }
}
