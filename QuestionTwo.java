import java.util.Scanner;

public class QuestionTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.next();
    System.out.print("Enter roll number: ");
    int rollNum = sc.nextInt();
    System.out.print("Enter field of interest: ");
    String fieldOfInterest = sc.next();

    System.out.println("Hey, my name is " + name
            + " and my roll number is " + rollNum
            + ". My field of interest are " + fieldOfInterest + ".");

    sc.close();
  }
}
