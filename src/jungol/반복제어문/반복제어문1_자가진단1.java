package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문1_자가진단1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i += 1) {
            System.out.print(i + " ");
        }

        Scanner in = new Scanner(System.in);

        char c = in.next().charAt(0);
        for (int i = 1; i <= 20; i += 1) {
            System.out.printf("%c", c);
        }
    }
}
