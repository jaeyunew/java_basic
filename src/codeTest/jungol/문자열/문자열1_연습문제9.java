package codeTest.jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = in.nextLine();

        int lenOfStr = inputString.length();

        for (int i = 1; i <= lenOfStr; i++) {
            System.out.println(inputString.substring(i) + inputString.substring(0, i));

        }
    }
}
