package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int i = 1;


        for (i = 1; sum < num; i++) {
            sum = sum + i;
        }
        System.out.println(i - 1 + " " + sum);

        int n = in.nextInt();
        int number = 1;
        int total = 0;

        while (number <= n) {
            total += number;
            if (total > n) break;
            ++number;
        }
        System.out.printf("%1$d %2$d", number, total);
    }
}
