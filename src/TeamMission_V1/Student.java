package TeamMission_V1;

public class Student implements java.io.Serializable {

  static final long serialVersionUID = 1;
  private String name;
  private int[] record;
  private int total;
  private float average;
  private String grade;

  public Student() {
    this.name = "^^";  // 객체를 읽을 때 끝이되는 구분문자
    this.record = new int[4];
  }

  public Student(String name, int[] record) {
    this.name = name;
    this.record = record;

    this.makeScores();
  }

  public Student(String name, int korean, int english, int math, int etc) {
    record = new int[4];

    this.name = name;
    this.record[0] = korean;
    this.record[1] = english;
    this.record[2] = math;
    this.record[3] = etc;

    this.makeScores();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setRecord(int[] record) {
    this.record = record;
    this.makeScores();
  }

  public int[] getRecord() {
    return this.record;
  }

  public int getTotal() {
    return this.total;
  }

  public float getAverage() {
    return this.average;
  }

  public String getGrade() {
    return this.grade;
  }

  private void makeScores() {
    for (int i = 0; i < 4; i++) {
      this.total += this.record[i];
    }
    this.average = (float) this.total / 4;
    this.makeGrade();
  }

  private void makeGrade() {
    if (90 <= this.average && this.average <= 100) {
      this.grade = "A";
    } else if (80 <= this.average && this.average < 90) {
      this.grade = "B";
    } else if (70 <= this.average && this.average < 80) {
      this.grade = "C";
    } else if (60 <= this.average && this.average < 70) {
      this.grade = "D";
    } else if (0 <= this.average && this.average < 60) {
      this.grade = "F";
    }
  }


  public String toString() {
    return record[0] + "\t " + record[1] + "\t " + record[2] + "\t " + record[3] + "\t " + total
        + "\t" + average + "\t  " + grade;
  }

}