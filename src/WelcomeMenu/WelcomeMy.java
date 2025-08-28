package WelcomeMenu;

import java.util.Scanner;

public class WelcomeMy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = in.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = in.nextLine();

        boolean off = true;


        while (off) {
            System.out.println("*****************************************************");
            System.out.println("           Welcome to Shopping Mall");
            System.out.println("           Welcome to Book Market!");
            System.out.println("*****************************************************");
            System.out.println("1. 고객 정보 확인하기         4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기     5. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기            6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기            8. 종료");
            System.out.println("******************************************************");
            System.out.print("메뉴 번호를 선택해주세요");

            int num = in.nextInt();

            if (num == 1) {
                System.out.println("헌재 고객정보 : ");
                System.out.println("이름 " + userName + " 연락처 " + userMobile);
            } else if (num == 2) {
                System.out.println("장바구니 상품 목록 보기");
            } else if (num == 3) {
                System.out.println("장바구니의 항목 수량 비우기");
            } else if (num == 4) {
                System.out.println("바구니에 항목 추가하기");
            } else if (num == 5) {
                System.out.println("장바구니의 항목 수량 줄이기");
            } else if (num == 6) {
                System.out.println("장바구니의 항목 삭제하기");
            } else if (num == 7) {
                System.out.println("영수증 표시하기");
            } else if (num == 8) {
                off = false;
            }
        }
    }
}
