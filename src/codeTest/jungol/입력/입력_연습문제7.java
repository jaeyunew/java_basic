package codeTest.jungol.입력;

import java.util.Scanner;

public class 입력_연습문제7 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("두 수를 입력하시오.");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "*" + b + "=" + (a * b));
    }
}
