package day05.whileEx;

public class WhileEx02 {
    public static void main(String[] args) {
        // 1부터 100까지 합을 출력하는 프로그램 - while문 이용
        int loop = 1;
        int sum = 0;
        while (loop <= 100) {
            sum = sum + loop;
            loop += 1;
        }
        System.out.println(sum);
    }
}
