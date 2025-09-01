package codeTest.jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_형성평가7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
    }
}
