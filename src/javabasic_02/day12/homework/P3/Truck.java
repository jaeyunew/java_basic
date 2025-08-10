package javabasic_02.day12.homework.P3;

public class Truck extends Wheeler {

    public Truck(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed * 5;
        if (velocity > 100) {
            velocity = 100;
        }
        System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed * 5;
        if (velocity < 50) {
            velocity = 50;
            System.out.println(carName + "의 최저속도위반으로 속도를 50으로 올립니다.");
        } else {
            System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
        }
    }
}