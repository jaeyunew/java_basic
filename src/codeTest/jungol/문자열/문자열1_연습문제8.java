package codeTest.jungol.문자열;


import java.util.Scanner;

public class 문자열1_연습문제8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString = in.nextLine();
        String[] splitArray = inputString.split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            System.out.println(splitArray[i]);
        }
    }
}
