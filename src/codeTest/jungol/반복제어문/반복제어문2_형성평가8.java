package codeTest.jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        row = sc.nextInt();
        col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
