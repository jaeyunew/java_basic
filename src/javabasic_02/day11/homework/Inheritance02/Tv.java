package javabasic_02.day11.homework.Inheritance02;

public class Tv {
    public String color;
    public boolean power;
    public int channel;



    public Tv() {
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power() {
        this.power = !this.power;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        this.channel--;
    }

    public void print() {
        System.out.println("color :" + color + "\tpower:" + power + "\tchannel:" + channel);
    }

}
