package javabasic_02.day12.homework.P1;

public abstract class Shape {
    private double area;
    private String name;

    public Shape(){}

    public Shape(String name){
        this.name=name;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calculationArea();
    public abstract void print();
}
