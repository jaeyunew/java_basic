package codeTest.jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
