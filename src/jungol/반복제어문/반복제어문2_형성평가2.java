package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }
}
