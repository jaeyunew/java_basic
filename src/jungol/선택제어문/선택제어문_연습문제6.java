package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args) {

        //Math.max() 를 이용하여 풀어보세요.
        Scanner in = new Scanner(System.in);

        System.out.println("세 수를 입력하세요.");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(a, b);
        int max2 = Math.max(max, c);

        System.out.printf("입력받은 수 중 가장 큰 수는 %d 입니다.", max2);
    }
}
