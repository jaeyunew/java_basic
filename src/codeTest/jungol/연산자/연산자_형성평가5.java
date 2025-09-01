package codeTest.jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cm1 = sc.nextInt();
        int kg1 = sc.nextInt();
        int cm2 = sc.nextInt();
        int kg2 = sc.nextInt();
        System.out.println(cm1 > cm2 && kg1 > kg2 ? 1 : 0);
    }
}
