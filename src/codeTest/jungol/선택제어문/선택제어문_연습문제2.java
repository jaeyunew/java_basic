package codeTest.jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.printf("입력받은 수 중 큰 수는 %1$d이고 작은 수는 %2$d입니다.", a, b);
        } else {
            System.out.printf("입력받은 수 중 큰 수는 %2$d이고 작은 수는 %1$d입니다.", a, b);
        }
    }
}
