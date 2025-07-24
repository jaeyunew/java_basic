package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("키를 입력하세요.");
        int a = input.nextInt();
        System.out.println("몸무게를 입력하세요.");
        double b = input.nextDouble();
        System.out.println("이름을 입력하세요.");
        String name = input.next();

        System.out.println("키 = " + a );
        System.out.printf("몸무게 = %.1f\n", b);
        System.out.println("이름 = " + name);
    }
}
