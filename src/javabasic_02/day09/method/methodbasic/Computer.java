package javabasic_02.day09.method.methodbasic;

import java.util.Scanner;

public class Computer {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String inputData = in.nextLine();
        int[] fixData = totalData(inputData);
        totalSum(fixData);
    }

    public static int[] totalData(String inputData) {
        String[] splitData = inputData.split(" ");
        int data1 = Integer.parseInt(splitData[0]);
        int data2 = Integer.parseInt(splitData[1]);
        int data3 = Integer.parseInt(splitData[2]);
        int data4 = Integer.parseInt(splitData[3]);
        int data5 = Integer.parseInt(splitData[4]);

        int[] datas = new int[]{data1, data2, data3, data4, data5};
        return datas;
    }

    public static void totalSum(int[] datas) {
        int result = 0;
        for (int i = 0; i < datas.length; i++) {
            result += datas[i];
        }
        System.out.println("1부터 5까지의 누적합은 " + result + " 입니다.");
    }

}
