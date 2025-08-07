package javabasic_02.day12.homework.P1;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculationArea() {
        double area = radius * radius * Math.PI;
        setArea(area);
    }

    @Override
    public void print() {
        System.out.println(getName() + "의 면적은 "+getArea());
    }
}
