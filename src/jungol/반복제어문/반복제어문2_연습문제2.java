package jungol.반복제어문;

public class 반복제어문2_연습문제2 {
    public static void main(String[] args) {
        int ch =65;
        for(int i = 1; i<=26; i+=1) {
            System.out.printf("%c", ch);
            ch = ch + 1;
        }
        int total = 0;

        for(int i=1; i<=100; i+=1){
            total = total + i;
        }
        System.out.println(total);
    }
}
