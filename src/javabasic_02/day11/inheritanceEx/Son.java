package javabasic_02.day11.inheritanceEx;

public class Son extends Father {
    void name() {
        System.out.println("나의 이름은 홍길동");
    }

    void printDetails() {
        name();
        familyName();
        houseAddress();
    }


}
