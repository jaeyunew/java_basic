package javabasic_02.day10.morningTest;

public class Member {
    String name;
    String id;
    String pasddword;
    int age;

    Member(){}
    Member(String name, String id) {
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Member user1 = new Member();
        System.out.println(user1.toString());
        System.out.println(user1.name);  //인스턴스 객체
        System.out.println(user1.id);
        System.out.println(user1.pasddword);
        System.out.println(user1.age);

        Member user2 = new Member("홍길동","hong");
        System.out.println(user2.name);  //인스턴스 객체
        System.out.println(user2.id);
        System.out.println(user2.pasddword);
        System.out.println(user2.age);
    }
}
