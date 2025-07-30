package javabasic_01.day03;

import java.util.Scanner;

public class PrintfEx {
    public static void main(String[] args) {
        System.out.printf("%d원\n", 5000);
        System.out.printf("%7d원\n", 5000);
        System.out.printf("%07d원\n", 5000);

        Scanner in = new Scanner(System.in);
        System.out.println("반지름을 입력하세요.");
        int a = in.nextInt();
        double area = a * a* Math.PI;

        System.out.printf("반지름이 %d인 원의 넓이: %.1f" ,a, area);
    }
}
