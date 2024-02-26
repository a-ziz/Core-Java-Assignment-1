abstract class Marks {

  abstract public String getPercentage();
}

class StudentA extends Marks {

  private int subject1;
  private int subject2;
  private int subject3;

  public StudentA(int subject1, int subject2, int subject3) {
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;
  }

  @Override
  public String getPercentage() {
    double totalMarks = (subject1 + subject2 + subject3) / 3;
    double avg = totalMarks / 100 * 100;
    Integer avgPercent = (int) avg;
    return "Average marks of Student A: " + avgPercent.toString() + "%";
  }
}

class StudentB extends Marks {
  private int subject1;
  private int subject2;
  private int subject3;
  private int subject4;

  public StudentB(int subject1, int subject2, int subject3, int subject4) {
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;
    this.subject4 = subject4;
  }

  @Override
  public String getPercentage() {
    double totalMarks = (subject1 + subject2 + subject3 + subject4) / 4;
    double avg = totalMarks / 100 * 100;
    Integer avgPercent = (int) avg;
    return "Average marks of Student B: " + avgPercent.toString() + "%";
  }
}

public class QuestionFour {
  public static void main(String[] args) {
    StudentA s1 = new StudentA(78, 70, 90);
    System.out.println(s1.getPercentage());

    StudentB s2 = new StudentB(70, 90, 60, 80);
    System.out.println(s2.getPercentage());

    //    StudentA s3 = new StudentA(88, 80, 90);
    //    System.out.println(s3.getPercentage());
  }
}
