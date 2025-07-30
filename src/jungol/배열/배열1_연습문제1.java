package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];


        System.out.println("=======iter 방식 입력=======");

        for (int i = 0; i < array.length; i++) {
            array[i]= in.nextInt();

        }
        System.out.println("=======iter 방식 출력=======");

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("=======itar 방식 출력=======");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
    }
}
