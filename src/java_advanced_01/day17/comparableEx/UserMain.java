package java_advanced_01.day17.comparableEx;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("김유신", 64),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("박희동", 14),
        };

        Arrays.sort(users);

        for (User user : users) {
            System.out.println(user.name + ":" + user.age);
        }


    }

}
