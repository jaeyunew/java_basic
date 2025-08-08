package javabasic_02.day13.morning;

public class User {

    public static void main(String[] args) {
        // 인터페이스를 통해 객체의 기능을 수행
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(10);
        rc.setMute(true);
        rc.setMute(false);
        RemoteControl.chargeBattery(); //정적 메소드 수행


        //TV의 최대 볼륨 확인 public static final은 타입.상수명
        System.out.println(RemoteControl.MAX_VOLUME);

        //TV의 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);


    }
}