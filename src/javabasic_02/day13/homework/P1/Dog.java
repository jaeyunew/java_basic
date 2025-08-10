package javabasic_02.day13.homework.P1;

public class Dog extends Animal {
    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance += speed * hours * 0.5;
    }
}
