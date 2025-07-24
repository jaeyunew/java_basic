package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("sum = " + (a+b+c));
    }
}
