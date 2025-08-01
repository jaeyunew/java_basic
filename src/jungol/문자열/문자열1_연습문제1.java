package jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            char ch = in.next().charAt(0);
            System.out.printf("%c -> %d\n", ch, (int) ch);
            if (ch == '0') break;
        }
    }
}
