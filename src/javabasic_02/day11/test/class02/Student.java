package javabasic_02.day11.test.class02;

public class Student {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print() {
        System.out.println("이  름 : " + name + "\t나  이 : " + age + "\t학  번 :" + id);

    }
}
