package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_연습문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        double avg;
        for (int i = 1; i <= 5; i++) {
            int grade = in.nextInt();
            sum = sum + grade;
        }
        avg = (double) sum/5;
        System.out.printf("총점 : %d\n평균 : %.1f", sum, avg);
    }
}
