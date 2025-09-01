package codeTest.jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= 10; i++) {
            int num = in.nextInt();
            if (num % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }

        }
        System.out.printf("even : %d\nodd : %d", even, odd);
    }
}
