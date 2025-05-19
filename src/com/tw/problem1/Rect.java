package com.tw.problem1;

public class Rect {
    private final int length;
    private final int width;

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return this.length * this.width;
    }

    public int perimeter() {
        return 2 * (this.length + this.width);
    }
}
