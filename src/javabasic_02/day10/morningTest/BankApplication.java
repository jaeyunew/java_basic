package javabasic_02.day10.morningTest;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accounts = new Account[100];
    private static int count = 0;
    static Scanner in = new Scanner(System.in);
    private static boolean run = true;

    private static final String MENU = """
            ---------------------------------------------
            1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
            ---------------------------------------------
            선택>\s""";

    private static final String TITLE_FORMAT = """
            -----------
            %s
            -----------
            """;

    public static void main(String[] args) {


        while (run) {
            System.out.println(MENU);
            int num = Integer.parseInt(in.nextLine());

            switch (num) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    listAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("1~5사이의 숫자만 입력가능합니다.");


            }
        }
    }

    private static void createAccount() {
        System.out.printf(TITLE_FORMAT, "계좌생성");
        System.out.print("계좌번호: ");
        String number = in.nextLine();
        System.out.println("계좌주: ");
        String name = in.nextLine();
        System.out.println("초기입금액: ");
        int balance = Integer.parseInt(in.nextLine());

        accounts[count++] = new Account(number, name, balance);
        System.out.println("결과: 계좌가 생성되었습니다.");

    }

    private static void listAccount() {
        System.out.printf(TITLE_FORMAT, "계좌목록");
        for (int i = 0; i < count; i++) {

            System.out.print(accounts[i].getNumber() + "\t" + accounts[i].getName() + "\t" + accounts[i]);

        }
    }

    private static void deposit() {
        System.out.printf(TITLE_FORMAT, "예금");
        System.out.print("계좌번호: ");
        String number = in.nextLine();
        System.out.print("예금액: ");
        int balance = Integer.parseInt(in.nextLine());

    }

    private static void withdraw() {
        System.out.printf(TITLE_FORMAT, "출금");
        System.out.print("계좌번호: ");
        String number = in.nextLine();
        System.out.print("출금액: ");
        int balance = Integer.parseInt(in.nextLine());
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    private static void exit() {
        System.out.println("프로그램 종료");
        run = false;
    }
}
