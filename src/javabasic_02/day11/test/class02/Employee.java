package javabasic_02.day11.test.class02;

public class Employee {
    private String name;
    private int age;
    private String dept;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print() {
        System.out.println("이  름 : " + this.name + "\t나  이 : " + this.age + "\t학  번 :" + this.dept);

    }
}


