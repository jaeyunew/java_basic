package codeTest.jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_연습문제4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i += 1) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
