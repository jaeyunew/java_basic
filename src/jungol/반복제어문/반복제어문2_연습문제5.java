package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문2_연습문제5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            int num = in.nextInt();
            if (num % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.printf("입력받은 짝수는 %d개입니다.", count);
    }
}
