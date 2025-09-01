package codeTest.jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        String str = "jungol olympiad";
        int[] index = new int[5];

        for (int i = 0; i < index.length; i++) {
            index[i] = in.nextInt();
        }
        for (int i = 0; i < index.length; i++) {
            System.out.print(str.charAt(index[i]));
        }
    }
}
