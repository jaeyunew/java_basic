package jungol.문자열;

import java.util.Scanner;

public class 문자열2_연습문제2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str = in.nextLine();
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);

        }
    }
}
