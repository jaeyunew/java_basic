package javabasic_02.day07;

public class MemberTest {
    public static void main(String[] args) {
        Member ss_health1 = new Member();
        ss_health1.name = "홍길동";
        ss_health1.age = 30;
        ss_health1.phoneNumber = "010-1111-1111";
        ss_health1.Email = "fc@naver.com";
        ss_health1.adress = "서울";
        ss_health1.weight = "57.6kg";

        Member ss_health2 = new Member();
        ss_health2.name = "김재윤";
        ss_health2.age = 27;
        ss_health2.phoneNumber = "010-2222-2222";
        ss_health2.Email = "qk@naver.com";
        ss_health2.adress = "인천";
        ss_health2.weight = "70.2kg";

        //삼성 지점 sshealth 헬스센터
        Member[] 삼성 = new Member[2];
        삼성[0] = ss_health1;
        삼성[1] = ss_health2;

        for (int i = 0; i < 삼성.length; i++) {
            Member member = 삼성[i];
            System.out.println(member.name);

        }
    }
}
