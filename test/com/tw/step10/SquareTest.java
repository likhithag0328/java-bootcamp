package com.tw.step10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void areaTestForValidSquare() {
        Square square = new Square(7);
        assertEquals(square.area(),49);
    }

    @Test
    void areaTestForInValidSquare() {
        Square square = new Square(0);
        assertEquals(square.area(),0);
    }

    @Test
    void perimeterTestForValidSquare() {
        Square square = new Square(5);
        assertEquals(square.perimeter(),20);
    }

    @Test
    void perimeterTestForInValidSquare() {
        Square square = new Square(0);
        assertEquals(square.perimeter(),0);
    }
}