package day02;

import java.util.Scanner;

public class FourArithmetic {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        b = sc.nextInt();
        System.out.println("a+b=" + a + b);
    }
}
