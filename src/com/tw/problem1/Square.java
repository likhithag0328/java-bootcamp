package com.tw.step10;

public class Square {
    private final Rect rect;

    public Square(int side) {
        this.rect = new Rect(side,side);
    }

    public int area() {
        return rect.area();
    }

    public int perimeter() {
        return rect.perimeter();
    }
}
