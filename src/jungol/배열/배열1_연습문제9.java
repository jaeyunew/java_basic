package jungol.배열;

import java.util.Arrays;

public class 배열1_연습문제9 {
    public static void main(String[] args) {
        int[] array = {95, 75, 85, 100, 50};  //배열의 생성 및 초기화 한번에 처리

        Arrays.sort(array);   //오름차순 정렬

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
