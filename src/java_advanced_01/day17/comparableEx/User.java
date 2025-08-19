package java_advanced_01.day17.comparableEx;

public class User implements Comparable<User> {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(User o) {
        if (this.age < o.age) return -1;
        else if (this.age > o.age) return 1;
        else return 0;
    }
}
