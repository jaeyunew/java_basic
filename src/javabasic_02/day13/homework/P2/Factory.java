package javabasic_02.day13.homework.P2;

public abstract class Factory {
    int openHour;
    int closeHour;
    String name;

    public Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public int getWorkingTime() {
        return closeHour - openHour;
    }

    public String getFactoryName() {
        return name;
    }
    public abstract int makeProducts(char skill);
}
