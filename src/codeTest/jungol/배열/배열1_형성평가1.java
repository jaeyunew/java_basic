package codeTest.jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] alphabet = new char[10];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = in.next().charAt(0);
        }
        for (int i = alphabet.length - 1; i >= 0; i--) {
            char c = alphabet[i];
            System.out.print(c + " ");
        }
    }
}
