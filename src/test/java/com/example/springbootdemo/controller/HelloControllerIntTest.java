package com.example.springbootdemo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerIntTest
{

    @Autowired
    private MockMvc mvc;

    @Test
    void hello() throws Exception
    {
        // given
        RequestBuilder request = get("/hello");

        // when
        MvcResult result = mvc.perform(request).andReturn();

        // then
        assertEquals(200, result.getResponse().getStatus());
    }

    @Test
    public void testHelloWithName() throws Exception
    {
        // given
        RequestBuilder request = get("/hello?name=Bob");

        // when
        MvcResult result = mvc.perform(request).andReturn();

        // then
        assertEquals(200, result.getResponse().getStatus());
    }
}