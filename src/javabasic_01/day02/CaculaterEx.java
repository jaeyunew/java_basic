package javabasic_01.day02;

import java.util.Scanner;

public class CaculaterEx {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        a = input.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        b = input.nextInt();
        System.out.println("결과는 다음과 같습니다.");
        System.out.println(a + b);
    }
}
