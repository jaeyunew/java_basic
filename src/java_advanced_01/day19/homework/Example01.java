package java_advanced_01.day19.homework;

import java.util.Arrays;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        List<Member01> list = Arrays.asList(
                new Member01("홍길동",30),
                new Member01("홍길동",40),
                new Member01("감자바",26)
        );

        double avg=list.stream().mapToInt(Member01->Member01.getAge()).average().getAsDouble();

        System.out.println("평균 나이: " + avg);
    }
}
