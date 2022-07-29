package com.example.springbootdemo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HelloControllerTest
{
    @Mock
    private Model model;

    @Test
    void hello()
    {
        HelloController controller = new HelloController(); // Arrange
        String response = controller.hello("World", model); // Act
        assertEquals("hello", response);// Assert
    }
}