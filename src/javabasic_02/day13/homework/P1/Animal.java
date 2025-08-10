package javabasic_02.day13.homework.P1;

public abstract class Animal {
    int speed;
    double distance;

    public Animal(int speed){
        this.speed=speed;
    }

    public abstract void run(int hours);

    public double getDistance(){
        return distance;
    }
}
