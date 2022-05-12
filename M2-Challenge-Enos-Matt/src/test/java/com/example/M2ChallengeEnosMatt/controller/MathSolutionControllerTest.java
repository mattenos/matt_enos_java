package com.example.M2ChallengeEnosMatt.controller;

import com.example.M2ChallengeEnosMatt.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void shouldAddTwoIntegers() throws Exception{
        MathSolution mathInputJson = new MathSolution(2,2,"add", 4);
        MathSolution mathOutputJson = new MathSolution(2,2,"add", 4);

        String inputJson = mapper.writeValueAsString(mathInputJson);
        String outputJson = mapper.writeValueAsString(mathOutputJson);

        mockMvc.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldSubtractTwoIntegers() throws Exception{
        MathSolution mathInputJson = new MathSolution(2,2,"subtract", 0);
        MathSolution mathOutputJson = new MathSolution(2,2,"subtract", 0);

        String inputJson = mapper.writeValueAsString(mathInputJson);
        String outputJson = mapper.writeValueAsString(mathOutputJson);

        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldMultiplyTwoIntegers() throws Exception{
        MathSolution mathInputJson = new MathSolution(2,4,"multiply", 8);
        MathSolution mathOutputJson = new MathSolution(2,4,"multiply", 8);

        String inputJson = mapper.writeValueAsString(mathInputJson);
        String outputJson = mapper.writeValueAsString(mathOutputJson);

        mockMvc.perform(post("/multiply")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldDivideTwoIntegers() throws Exception{
        MathSolution mathInputJson = new MathSolution(4,2,"divide", 2);
        MathSolution mathOutputJson = new MathSolution(4,2,"divide", 2);

        String inputJson = mapper.writeValueAsString(mathInputJson);
        String outputJson = mapper.writeValueAsString(mathOutputJson);

        mockMvc.perform(post("/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));

    }
}