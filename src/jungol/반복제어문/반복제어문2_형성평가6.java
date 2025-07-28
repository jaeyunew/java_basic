package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        int x = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                x += 1;
            }
        }

        double avg = (double) sum / x;
        System.out.printf("sum : %d\navg : %.1f", sum, avg);
    }
}
