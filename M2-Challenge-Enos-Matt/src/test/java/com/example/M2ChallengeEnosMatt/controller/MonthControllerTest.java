package com.example.M2ChallengeEnosMatt.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MonthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnMonthOnValidGetRequest() throws Exception {
        String outputJson = "August";

        mockMvc.perform(
                        get("/month/8")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(outputJson));
    }

    @Test
    public void shouldReturn422ForInvalidMonthId() throws Exception {
        mockMvc.perform(
                        get("/month/999")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}