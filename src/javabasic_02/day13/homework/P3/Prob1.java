package javabasic_02.day13.homework.P3;

public class Prob1 {

    public static void main(String args[]) {

        Prob1 prob1 = new Prob1();

        System.out.println(prob1.leftPad("SDS", 6, '#'));
        System.out.println(prob1.leftPad("SDS", 5, '$'));
        System.out.println(prob1.leftPad("SDS", 2, '&'));

    }

    public String leftPad(String str, int size, char padChar) {
        int rpt = size - str.length();
        if (rpt < 0) {
            return str;
        }
        String charSum = "";
        for (int i = 0; i < rpt; i++) {
            charSum += padChar;
        }
        return charSum + str;
    }

}
