package javabasic_02.day11.homework.Constructor01;

public class Rectangle {
    private int width;
    private int height;
    private int area;
    private String color;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
        this.color = "흰색";
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = "흰색";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public void calculateArea() {
        this.area = this.width * this.height;
    }
}
