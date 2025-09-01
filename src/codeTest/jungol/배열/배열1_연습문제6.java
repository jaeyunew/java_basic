package codeTest.jungol.배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 배열1_연습문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer[] outputArray = new Integer[10];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = in.nextInt();

        }
        Arrays.sort(outputArray, Collections.reverseOrder());
        System.out.println(outputArray[0]);

        System.out.println("================");
        Arrays.sort(outputArray);
        System.out.println(outputArray[9]);
    }
}
