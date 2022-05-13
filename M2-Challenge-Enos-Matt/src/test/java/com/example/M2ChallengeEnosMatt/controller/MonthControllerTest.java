package com.example.M2ChallengeEnosMatt.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnMonthWhenPassedAValidMonth() throws Exception {
        String outputJson = "September";

        mockMvc.perform(
                get("/month/9")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(outputJson));    }

    @Test
    public void shouldReturn422WhenPassedAnInvalidMonth() throws Exception {
        mockMvc.perform(
                get("/month/13")
                        .contentType(MediaType.APPLICATION_JSON)
                        )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}
