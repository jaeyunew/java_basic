package codeTest.jungol.입력;

import java.util.Scanner;

public class 입력_연습문제9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("두 개의 실수를 입력하시오");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.printf("x = %.2f\n", a);
        System.out.printf("x = %.2f\n", b);
    }
}
