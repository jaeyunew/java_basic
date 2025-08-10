package javabasic_02.day13.homework.P2;

public class TVFactory extends Factory implements IWorkingTogether {
    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        int skillTime;
        switch (skill) {
            case 'A':
                skillTime = 8;
                break;
            case 'B':
                skillTime = 5;
                break;
            case 'C':
                skillTime = 3;
                break;
            default:
                skillTime = 1;
        }
        return skillTime * getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((TVFactory)partner).makeProducts('C');
    }
}

