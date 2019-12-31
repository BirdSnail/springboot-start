package com.birdsnail.springboot.training.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
public class SpringBootApplicationIntegrationTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @BeforeEach
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

//    @Test
//    public void givenRequestHasBeenMade_whenMeetsAllOfGivenConditions_thenCorrect()
//            throws Exception {
//        MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
//                MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
//        mockMvc.perform(MockMvcRequestBuilders.get("/entity/all")).
//                andExpect(MockMvcResultMatchers.status().isOk()).
//                andExpect(MockMvcResultMatchers.content().contentType(contentType)).
//                andExpect(jsonPath("$", hasSize(4)));
//    }
}