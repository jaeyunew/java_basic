package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        for (int i = 1; i <= 20; i++) {
            int num = in.nextInt();
            if (num == 0) break;
            sum += num;
            n++;
        }

        System.out.println(sum + " " + sum / n);
    }
}
