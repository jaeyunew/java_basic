package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = 1; i <= 9; i++) {
            for (int j = max; j >= min; j--) {
                System.out.printf("%d * %d = %d   ", j, i, i * j);
            }
            System.out.println();
        }
    }
}
