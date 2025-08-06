package javabasic_02.day11.homework.Constructor02;

public class Rectangle {
    private int width;
    private int length;
    private String color;


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int area() {
        return this.width * this.length;
    }

    public int perimeter() {
        return 2 * (this.width + this.length);
    }
}
