package javabasic_02.day13.afternoon.sec01;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOff() {
        System.out.println("TV의 전원 Off");
    }

    @Override
    public void turnOn() {
        System.out.println("TV의 전원 On");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "검색합니다.");
    }
}
