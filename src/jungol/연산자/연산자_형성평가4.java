package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d\n", ++a, b--);
        System.out.printf("%d %d", a, b);
    }
}
