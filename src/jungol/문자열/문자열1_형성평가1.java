package jungol.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열1_형성평가1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char[] alphaArray = new char[2];

        for (int i = 0; i < alphaArray.length; i++) {
            alphaArray[i] = in.next().charAt(0);
        }
        Arrays.sort(alphaArray);

        System.out.print((alphaArray[1] + alphaArray[0]) + " " + (alphaArray[1] - alphaArray[0]));
    }
}
