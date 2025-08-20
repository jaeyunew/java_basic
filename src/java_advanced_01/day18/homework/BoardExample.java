package java_advanced_01.day18.homework;

import java.util.Scanner;

public class BoardExample {
    static Scanner in = new Scanner(System.in);
    static boolean stop = false;

    public static void main(String[] args) {
        BoardExample boards = new BoardExample();
        boards.list();
    }

    public void list() {
        String menu = """
                [게시물 목록]
                --------------------------------------------
                no  writer     date          title
                --------------------------------------------
                1   winter  2024.01.02      게시판에 오신 것을 환영합니다.
                2   winter  2024.01.01      올 겨울은 많이 춥습니다.
                %-5s %-10s %-20s %s
                """;

        mainMenu();

    }

    public void mainMenu() {
        String mainMenu = """
                --------------------------------------------
                메인 메뉴: 1.Create |2.Read |3.Clear |4.Exit
                메뉴 선택:
                """;
        System.out.println(mainMenu);

        while (!stop) {
            System.out.print("메뉴선택> ");
            String choice = in.nextLine();

            switch (choice) {
                case "1" -> System.out.println("****create() 메소드 실행");
                case "2" -> System.out.println("****read() 매소드 실행");
                case "3" -> System.out.println("****clear() 매소드 실행");
                case "4" -> {
                    System.out.println("****exit() 매소드 실행");
                    stop = false;
                }

            }


        }
    }

}
