package javabasic_02.day09.method.oop;

public class Student {
    //Student 클래스의 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    public String gender;
    private int[] scores = new int[3];
    int kor,eng, math;

    //생성자를 통하여 학생 객체의 필드를 초기화
    Student() {
    }      //기본 생성자

    Student(String stu_name, String stu_ssn) {
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
    }

    Student(String stu_name, Integer stu_age, String address, String stu_ssn) {
        this.stu_name = stu_name;
        this.address = address;
        this.stu_age = stu_age;
        this.stu_ssn = stu_ssn;
    }

    Student(int kor, int eng, int math){
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }

    public void setScores(int kor, int eng, int math) {
        scores[0] = kor;
        scores[1] = eng;
        scores[2] = math;
    }

    public int getKor() {
        return scores[0];
    }

    public int geteng() {
        return scores[1];
    }

    public int getmath() {
        return scores[2];
    }

    public int getTotal() {
        return scores[0] + scores[1] + scores[2];
    }

    public double getAvg() {
        return getTotal() / 3.0;
    }

    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    //Object 클래스의 toString() 오버로딩
    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                '}';
    }

}
