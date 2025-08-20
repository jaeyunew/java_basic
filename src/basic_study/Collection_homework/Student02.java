package basic_study.Collection_homework;

public class Student02 implements Comparable<Student02> {
    public String id;
    public int score;

    public Student02(String id, int score) {
        this.id = id;
        this.score = score;
    }


    @Override
    public int compareTo(Student02 o) {
        if (this.score > o.score) return 1;
        else if (this.score < o.score) return -1;
        else return 0;
    }
}
