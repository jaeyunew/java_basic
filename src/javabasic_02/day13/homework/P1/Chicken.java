package javabasic_02.day13.homework.P1;

public class Chicken extends Animal implements Cheatable {
    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance += speed * hours;
    }

    @Override
    public void fly() {
        speed = speed * 2;
    }
}
