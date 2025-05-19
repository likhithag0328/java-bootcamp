package com.tw.step10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectTest {
    @Test
    void area() {
        Rect rect1 = new Rect(4,5);
        assertEquals(rect1.area(),20);

        Rect rect2 = new Rect(0,5);
        assertEquals(rect2.area(),0);
    }
}