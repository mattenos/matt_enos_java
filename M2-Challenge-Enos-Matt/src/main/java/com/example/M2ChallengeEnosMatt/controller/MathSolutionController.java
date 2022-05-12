package com.example.M2ChallengeEnosMatt.controller;

import com.example.M2ChallengeEnosMatt.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathSolutionController {

    @RequestMapping(value="/add", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution add(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("add");
        Integer answer = mathSolution.getOperand1() + mathSolution.getOperand2();
        mathSolution.setAnswer(answer);
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new IllegalArgumentException("operand1 and operand2 cannot be null");
        }
        return mathSolution;
    }

    @RequestMapping(value="/subtract", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution subtract(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("subtract");
        Integer answer = mathSolution.getOperand1() - mathSolution.getOperand2();
        mathSolution.setAnswer(answer);
        return mathSolution;
    }

    @RequestMapping(value="/multiply", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution multiply(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("multiply");
        Integer answer = mathSolution.getOperand1() * mathSolution.getOperand2();
        mathSolution.setAnswer(answer);
        return mathSolution;
    }

    @RequestMapping(value="/divide", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public MathSolution divide(@RequestBody MathSolution mathSolution) {
        mathSolution.setOperation("divide");
        Integer answer = mathSolution.getOperand1() / mathSolution.getOperand2();
        mathSolution.setAnswer(answer);
        return mathSolution;
    }
}
