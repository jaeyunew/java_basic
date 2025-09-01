package codeTest.jungol.반복제어문;

import java.util.stream.IntStream;

public class 반복제어문2_연습문제2 {
    public static void main(String[] args) {
        int ch = 65;
        for (int i = 1; i <= 26; i += 1) {
            System.out.printf("%c", ch);
            ch = ch + 1;
        }
        IntStream intStream = IntStream.rangeClosed(65,90);
        intStream.forEach(e -> System.out.print((char)e));
    }
}
