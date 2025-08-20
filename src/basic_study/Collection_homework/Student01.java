package basic_study.Collection_homework;

public class Student01 {
    public int studentNum;
    public String name;

    public Student01(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        if (obj == null) return false;
        Student01 student = (Student01) obj;
        return this.studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
