package com.tw.step10;

public class Square {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return this.side * this.side;
    }

    public int perimeter() {
        return 4 * this.side;
    }
}
