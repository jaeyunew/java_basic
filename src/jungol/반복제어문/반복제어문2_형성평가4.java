package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        double sum = 0;

        for (int i = 1; i <= count; i++) {
            double num = in.nextDouble();
            sum = sum + num;
        }

        double avg = sum / count;
        System.out.printf("%.2f", avg);
    }
}
