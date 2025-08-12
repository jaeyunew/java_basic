package javabasic_02.day13.homework.P2;

public class CarFactory extends Factory implements IWorkingTogether {
    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        int skillTime;
        switch (skill) {
            case 'A':
                skillTime = 3;
                break;
            case 'B':
                skillTime = 2;
                break;
            case 'C':
                skillTime = 1;
                break;
            default:
                skillTime = 0;
        }
        return skillTime * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {

        return ((CarFactory) partner).makeProducts('B');
    }
}
