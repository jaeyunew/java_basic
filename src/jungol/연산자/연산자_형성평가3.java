package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wid = sc.nextInt();
        int len = sc.nextInt();
        wid = wid + 5;
        len = len * 2;
        int area =wid *len;
        System.out.printf("width = %d\nlength = %d\narea = %d\n", wid, len, area);
    }
}
