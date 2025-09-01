package codeTest.jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= 100; i++) {
            System.out.print(num * i + " ");
            if ((num * i) % 10 == 0) break;
        }
    }
}
