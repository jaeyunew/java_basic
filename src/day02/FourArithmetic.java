package day02;

import java.util.Scanner;

public class FourArithmetic {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        b = sc.nextInt();

        System.out.printf("a+b=%d\n", a + b);
        System.out.printf("a-b=%d\n", a - b);
        System.out.printf("a*b=%d\n", a * b);
        System.out.printf("a/b=%d\n", a / b);

        int kor, eng, total;
        double avg;
        kor = 77;
        eng = 87;
        total = kor + eng;
        avg = total / 2;

        System.out.printf("총점:%d\n", total);
        System.out.printf("평균:%.1f", avg);

    }
}
