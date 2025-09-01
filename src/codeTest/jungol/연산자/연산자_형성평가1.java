package codeTest.jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int com = sc.nextInt();

        System.out.printf("sum %d\n", kor + eng + math + com);
        System.out.printf("avg %d", (kor + eng + math + com) / 4);
    }
}
