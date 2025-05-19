package com.tw.step10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectTest {
    @Test
    void areaTestForValidRect() {
        Rect rectangle = new Rect(4,5);
        assertEquals(rectangle.area(),20);
    }

    @Test
    void areaTestForInvalidRect() {
        Rect rectangle = new Rect(0,5);
        assertEquals(rectangle.area(),0);
    }

    @Test
    void perimeterForValidRect() {
        Rect rectangle = new Rect(5, 7);
        assertEquals(rectangle.perimeter(),24);
    }

    @Test
    void perimeterForInValidRect() {
        Rect rectangle = new Rect(0, 0);
        assertEquals(rectangle.perimeter(),0);
    }
}