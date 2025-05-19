package com.tw.step10;

public class Rect implements Shapes {
    private final int length;
    private final int width;

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int area() {
        return this.length * this.width;
    }

    @Override
    public int perimeter() {
        return 2 * (this.length + this.width);
    }
}
