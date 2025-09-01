package codeTest.jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] weight = new double[6];
        double sum = 0;

        for (int i = 0; i < weight.length; i++) {
            weight[i] = in.nextDouble();
        }
        for (int i = 0; i < weight.length; i++) {
            sum += weight[i];
        }
        System.out.printf("%.1f", sum / 6);
    }
}
