package com.example.slm_demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlmDemoAppControllerTest {

    // A - Arrange
    SlmDemoAppController demoController = new SlmDemoAppController();

    @Test
    void calculateSquare() {
        // A - Act
        double number = 8;

        // A - Assert
        assertEquals(64, demoController.calculateSquare(number));
    }

    @Test
    void calculateSquareTestNegativeNumbers() {
        double number = -8;
        assertEquals(64, demoController.calculateSquare(number));
    }

    @Test
    void calculateSquareTestZero() {
        double number = 0;
        assertEquals(0, demoController.calculateSquare(number));
    }
}
