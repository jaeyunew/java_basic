package javabasic_02.day12.homework.P1;

public class Rectangular extends Shape{
    private double width;
    private double hight;

    public Rectangular(String name,double width, double hight){
        super(name);
        this.width=width;
        this.hight=hight;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public void calculationArea() {
        double area = width*hight;
        setArea(area);
    }

    @Override
    public void print() {
        System.out.println(getName() + "의 면적은 "+getArea());
    }
}
