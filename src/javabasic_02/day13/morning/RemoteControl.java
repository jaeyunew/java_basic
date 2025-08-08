package javabasic_02.day13.morning;

public interface RemoteControl {
    //최대 볼륨은 30이다.
    public static final int MAX_VOLUME = 30;
    int MIN_VOLUME = 0;  //public static final 생략 가능 (인텔리제이에서 자동으로 부여)

    public void turnOn();  //전원켜기

    public void turnOff();  //전원 끄기

    public void setVolume(int volume);  //볼륨 조정 기능

    public void setMute(boolean mute);
    //디폴트 인스턴스 메소드
//    default void setMute(boolean mute){
//        if(mute){
//            System.out.println("무음 처리 작동시작");
//            setVolume(MIN_VOLUME);
//        }else {
//            System.out.println("무음 해제");
//        }
//          cooldown();
//    }
//
//

    //정적 메소드
    static void chargeBattery() {
        System.out.println("리모콘 건전지를 교환합니다.");
        //정적 필드, private static method 접근 가능

        System.out.println(RemoteControl.MIN_VOLUME);
        //setMute(true); 인스턴스 메소드, 디폴트 메소드,private 메소드 호출 불가
    }

    private void cooldown() {
    }


}
