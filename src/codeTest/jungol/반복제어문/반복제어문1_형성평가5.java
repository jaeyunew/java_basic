package codeTest.jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문1_형성평가5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = 0;
        int height = 0;
        double triangle_width = 0.0;
        String answer = " ";
        boolean flag = true;

        while (flag) {
            base = in.nextInt();
            height = in.nextInt();
            //숫자 입력을 받은 후 그 다음에 nextLine으로 문자열을 받으면 줄바꿈 문자 (\n)가 버퍼에 남아 있어서
            in.nextLine(); //숫자입력 후 in.nextLine()을 한 번 더 넣어서 버퍼 비워주기
            triangle_width = ((double) base * height) / 2;
            System.out.printf("Base = %d\n", base);
            System.out.printf("Height = %d\n", height);
            System.out.printf("Triangle width = %.1f\n", triangle_width);
            System.out.printf("continue? ");
            answer = in.nextLine();

            if (answer.equals("Y") || answer.equals("y")) continue;
            else break;
        }
    }
}
