package javabasic_02.day07;

public class DoubleArrayEx01 {
    public static void main(String[] args) {

        // 학생 3명의 국어, 영어, 수학 점수를 관리하는 이차원 배열을 만드세요
        int[][] scores = new int[3][3];
        String[] subjects = {"국어", "영어", "수학"};

        //1번 학생의 국어:90, 영어:50, 수학:80을 저장하고 출력하세요
        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;

        //2번 학생의 국어:80, 영어:100, 수학: 90을 저장하고 출력하세요

        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;

        //3번 학생의 국어:100, 영어:90 수학:90을 저장하고 출력하세요
        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 90;

        //각 학생들의 국어,영어,수학 점수와 총점과 평균을 학생별로 출력하세요
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.println((i + 1) + "번 학생 점수");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(subjects[j] + ":" + scores[i][j] + " ");
                sum += scores[i][j];
            }
            double avg = sum / 3.0;
            System.out.printf("총점: %d, 평균: %.1f", sum, avg);
            System.out.println();
        }

    }
}