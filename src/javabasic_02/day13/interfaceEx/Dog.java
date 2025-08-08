package javabasic_02.day13.interfaceEx;

public class Dog implements Soundable{
    @Override
    public String sound() {
        return "멍멍";
    }
}
